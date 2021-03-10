import java.util.Random;
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 3/9/2021
 Instructor: Professor Hellsing
 Description:
*/
import java.lang.Math;
public class Mode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scan for user input
        Random rand = new Random();
        int rowNum;
        int colNum;
//        1D array that Count how many times a number appears
        int [] modeCounter = new int [11];
//        2D array that stores random ints from 0 to 10 into the array for each row
        int [][] multiArray;
//        get amount of rows and columns from user
        System.out.println("Enter rows: ");
        rowNum = scan.nextInt();
        System.out.println("Enter columns: ");
        colNum = scan.nextInt();
//        create an array that is the size of the inputs
        multiArray =  new int[rowNum][colNum];
//        Nested loop that stores random ints from 0 to 10 into the array for each row
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                int ranNum = rand.nextInt(11);
                multiArray[i][j] = ranNum;
//                Count how many times a number appears(find the mode)
                modeCounter[ranNum] = modeCounter[ranNum] + 1;
//                System.out.println("Add " + multiArray[i][j]);
            }
        }
        int mode = 0;
        int timesRepeated = 0;
        int [] allModes = new int[1];

        for (int i = 0; i < modeCounter.length; i++) {

            if (mode < modeCounter[i]) {
//                clear array first
                allModes = new int[1];
//                Set mode to the new largest number
                mode = i;
//                allModes = Arrays.copyOf(allModes, allModes.length + 1);
//                allModes[allModes.length - 1] = mode;
//                allModes = Arrays.copyOf(allModes, allModes.length);
                allModes[0] = mode;
                timesRepeated = modeCounter[i];
            }

            else if (mode == modeCounter[i]) {
                allModes = Arrays.copyOf(allModes, allModes.length + 1);
                allModes[allModes.length - 1] = i;
            }
        }
        System.out.println(mode + "appeared " + timesRepeated);

        for (int num: allModes) {
            System.out.println(num);
        }

    }
}
