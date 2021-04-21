import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
public class Field {

    public Field() {
    }

    public static void createField() throws IOException {
        System.out.println("What's the name of the file?: ");
        Scanner scan = new Scanner(System.in);
        File fileName = new File(scan.nextLine());

        while (fileName.exists() == false) {
            System.out.println("File does not exist. What's the name of the file to load?: ");
            fileName = new File(scan.nextLine());
        }
        Scanner myFile = new Scanner(fileName);

        int numOfRows = 0;
        int numOfColumns = 0;

        int lifeSpanNum = 0;
        int x_cord = 0;
        int y_cord = 0;
        ArrayList<Integer> nutrients = new ArrayList<Integer>();

//
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
//                stringReader.next();
//                System.out.println(stringReader.next());
                nutrients.add(stringReader.nextInt());
                numOfRows++;
            }
        }
        myFile.close();

        //        Inits vars for field
        Mound[][] fieldLayout = new Mound[numOfRows/numOfColumns][numOfColumns];

        for (int i = 0; i < fieldLayout.length; i++) {
            int nutrientPlace = 0;
            for (int j = 0; j < fieldLayout[i].length; j++) {

                fieldLayout[i][j] = new Mound(nutrients.get(nutrientPlace));
                System.out.print("M"+ fieldLayout[i][j].getNumOfSpores() + " |");
                nutrientPlace++;
            }
            System.out.println();
        }
    }
}
