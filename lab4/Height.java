import java.util.Scanner;

/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 3/1/2021
 Instructor: Professor Hellsing
 Description:  a program that allows a user to enter the height, in inches, of 8 people in a
room, determine the average of the heights, and then output the average along with all of the heights.
*/
public class Height {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scan for user input
        final int numOfPeople = 8; // Set constant for size of array
        int[] heightArray  = new int[numOfPeople];

        int[] newHeightArray = getHeight(heightArray); // Prompts user for heights
        double averageHeight = getAvgHeight(newHeightArray); // Uses the new array to get average heights
        printEveryThing(newHeightArray, averageHeight); // Print all inputted heights and avg heights
    }
    public static int[] getHeight(int[] heightArray) {
        Scanner scan = new Scanner(System.in); // Scan for user input
        System.out.println("Please enter eight heights in inches: ");
//        Ask for a height 8 times and check value of each slot of the array each input
        for (int i = 0; i < heightArray.length; i++) {
            int heightInput = scan.nextInt();
            heightArray[i] = heightInput;
            scan.nextLine();
        }
        return heightArray;
    }
//    Get average height by dividing total heights by the number of heights (total/8)
    public static double getAvgHeight(int[] heightArray) {
        double avgHeight = 0;
        double total = 0;
        double count = 0;
        for ( int num : heightArray){
            count += 1.0;
            total += num;
        }
        avgHeight = total / count;
        return avgHeight;
    }
//    Receive the array and average height variables(newHeightArray, averageHeight)
//    Print results!
    public static void printEveryThing(int[] heightArray, double averageHeight){
        System.out.println("The heights in the class are: ");
        for (int num : heightArray ) {
            System.out.println(num);
        }
        System.out.println("So the average height is " + averageHeight);
    }
}
