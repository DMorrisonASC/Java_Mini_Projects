import java.util.Random;
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 3/9/2021
 Instructor: Professor Hellsing
 Description: Creates X amount of rows and columns based on user input. Prints these numbers in a grid format and outputs the mode(s)
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
            }
        }

        int mode = 0; //        Set var that stores the modes
        // Stores the highest amount of a times a number is called. Ex. if 6 appears 12 times, the value of the mode(12) is stored.
        int timesModeIsRepeated = modeCounter[0];
        int [] allModes = new int[1];

//      Loop find stores the highest amount of a times a number is called and sets the mode.
//      Ex. if 6 appears 12 times, the value of the mode is stored. `timesModeIsRepeated` = 12 then `mode` = 6 .
        for (int i = 0; i < modeCounter.length; i++) {

            if (timesModeIsRepeated < modeCounter[i]) {
//                clear array first
                allModes = new int[1];
//                Set mode to the new largest number
                mode = i;
//                Set timesModeIsRepeated to the highest value that appeared so far
                timesModeIsRepeated = modeCounter[i];
                allModes[0] = mode;
            }
//            If there are multiple modes and it's not the same mode.
//            Ex. If 1 appears 3x and 2 appears 2x, both are stored in `allModes`.
//            If not, don't store it.
//            This prevents 0 from being stored in `allModes` twice.
            else if (timesModeIsRepeated == modeCounter[i] && mode != i) {
                allModes = Arrays.copyOf(allModes, allModes.length + 1);
                allModes[allModes.length - 1] = i;
            }
        }

//        for (int i = 0; i < modeCounter.length; i++) {
//            System.out.println(i + " appeared " + modeCounter[i] + " times!");
//        }

//        Output final message!
//        loop prints in grid format
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
//                if number is a 10, take an extra whitespace to maintain grid.
                if (multiArray[i][j] == 10) {
                    System.out.print(" " + multiArray[i][j] + "|");
                }
                else {
                    System.out.print(" " + multiArray[i][j] + " |");
                }
            }

            System.out.println(); // Space out the numbers to create separate rows
        }
        System.out.println(); // Space for formatting
        System.out.println("The following mode(s) is/are: ");
        for (int num: allModes) {
            System.out.println(num);
        }
    }
}
