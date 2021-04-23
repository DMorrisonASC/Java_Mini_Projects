/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/18/2021
    Instructor: For a bit of fungi biology, many common
mushrooms grows from spores, which are released from adult mushrooms. Most mushrooms take a few days
to a little over a week to fully mature into adults. Your simulation will need to take this into account.
Your simulation should read in a file, specified by the user, which determines how long a mushroom lives,
where the initial spore is placed in the field, and what are the nutrient levels within the field. Then your
program should simulate one day at a time, as the mushrooms grow, mature, spread their spores to make
new mushrooms, and die off. Once there are no more mushrooms in the field, the program should specify
what day had the greatest number of mushrooms at once, how many mushrooms were there on that day, and
what the nutrient levels in the field are now.
*/
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Field {
    private Mound[][] fieldLayout;

    public Mound[][] getFieldLayout() {
        return fieldLayout;
    }

    public void setFieldLayout(Mound[][] fieldLayout) {
        this.fieldLayout = fieldLayout;
    }

    public Field() {
    }
    public void createField() throws IOException {
        System.out.println("What's the name of the file?: ");
        Scanner scan = new Scanner(System.in);
        File fileName = new File(scan.nextLine());

        while (fileName.exists() == false) {
            System.out.println("File does not exist. What's the name of the file to load?: ");
            fileName = new File(scan.nextLine());
        }
//        Init vars
        int numOfRows = 0;
        int numOfColumns = 0;
        int lifeSpanNum;
        int x_cord;
        int y_cord;
        ArrayList<Integer> nutrients = new ArrayList<Integer>();

        Scanner myFile = new Scanner(fileName);
        String line = myFile.nextLine();
        Scanner stringReader = new Scanner(line);
        stringReader.useDelimiter("=");

        stringReader.next();
        lifeSpanNum = stringReader.nextInt();

        line = myFile.nextLine();
        stringReader = new Scanner(line);
        stringReader.useDelimiter("=|,");

        stringReader.next();
        x_cord = stringReader.nextInt();
        y_cord = stringReader.nextInt();

        while (myFile.hasNextLine()) {
            line = myFile.nextLine();
            stringReader = new Scanner(line);
            stringReader.useDelimiter(",");
//            Count amount of columns in mound
            numOfColumns++;
            while (stringReader.hasNext()) {
                nutrients.add(stringReader.nextInt());
                numOfRows++;
            }
        }
        myFile.close();
        //   Create a two-dimensional array to store Mound objects in the Field
         setFieldLayout(new Mound[numOfRows/numOfColumns][numOfColumns]);
        int nutrientPlace = 0;
        for (int i = 0; i < fieldLayout.length; i++) {
            for (int j = 0; j < fieldLayout[i].length; j++) {
                fieldLayout[i][j] = new Mound(nutrients.get(nutrientPlace), 0, lifeSpanNum);
                nutrientPlace++;
            }
        }
        fieldLayout[x_cord][y_cord].setNumOfSpores(1);
        outputCurrentField();
        System.out.println("a");
    }

    public void oneDayPasses() {
//        for (int i = 0; i < fieldLayout.length; i++) {
//            for (int j = 0; j < fieldLayout[i].length; j++) {
//                Mound eachMound = fieldLayout[i][j];
//                eachMound.growSpores();
//                eachMound.expendLife();
//            }
////            outputCurrentField();
//        }
//        for (int i = 0; i < fieldLayout.length; i++) {
//            for (int j = 0; j < fieldLayout[i].length; j++) {
//                Mound eachMound = fieldLayout[i][j];
//                if (eachMound.getMushroomsInMound().size() == 1) {
//                    break;
//                }
//            }
//        }
//        while (anySporeLeft() == true) {
//            outputCurrentField();
//            for (int i = 0; i < fieldLayout.length; i++) {
//                for (int j = 0; j < fieldLayout[i].length; j++) {
//                    Mound eachMound = fieldLayout[i][j];
//                    eachMound.growSpores();
//                    eachMound.expendLife();
//                }
//            }
//        }
        do {
            for (int i = 0; i < fieldLayout.length; i++) {
                for (int j = 0; j < fieldLayout[i].length; j++) {
                    Mound eachMound = fieldLayout[i][j];
                    eachMound.growSpores();
                    eachMound.expendLife();
                }
            }
            outputCurrentField();
        }
        while (anySporeLeft() == true);
    }

    public void outputCurrentField(){
        for (int i = 0; i < fieldLayout.length; i++) {
            for (int j = 0; j < fieldLayout[i].length; j++) {
                System.out.print("M" + fieldLayout[i][j].getMushroomsInMound().size() + " |");
            }
//            Print separates each row. Ex: 5x5, 6x6, etc.
            System.out.println();
        }
//        Print gives each mound
        System.out.println();
    }

    public boolean anySporeLeft() {
        boolean isSporesLeft = false;
        for (int i = 0; i < fieldLayout.length; i++) {
            for (int j = 0; j < fieldLayout[i].length; j++) {
                Mound eachMound = fieldLayout[i][j];
                if (eachMound.getNumOfSpores() > 0) {
                    isSporesLeft = true;
                }
            }
        }
        return isSporesLeft;
    }
}
