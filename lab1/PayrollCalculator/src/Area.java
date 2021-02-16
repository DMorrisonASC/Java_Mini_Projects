/* Author: Daeshaun Morrison, class of 2024
 Date: 2/9/2020
 Instructor: Professor Hellsing
 Description: This program calculates the area of a rectangle via user inputs
*/

import java.util.Scanner; // To be able to read from keyboard
public class Area {
    public static void  main (String [] args) {
        boolean keepGoing = true;
        while (keepGoing) {
//        Create  a Scanner object to read user input from keyboard
            Scanner keyboard = new Scanner(System.in);
//        Identifier declarations
            double firstSide = 0;
            double secondSide = 0;
            String redo = "";
//        display prompt and get input from user
//            Run a "try and catch" that checks if the input is valid
//            If the input is not a number, keep asking the user to put a number
            while (true) {
                try {
                    System.out.print("What is the length of one side?: ");
                    firstSide = keyboard.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.print("That's not a valid input! \n");
                }
            }
//            Ask for second side
            while (true) {
                try {
                    System.out.print("What is the length of the other side?: ");
                    secondSide = keyboard.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.print("That's not a valid input! \n");
                }
            }
//            Calculate the area by multiplying one side by the other side
//            Area of rectangle = (Length * Width).
            double rectArea = firstSide * secondSide;
//        display results
            System.out.println("The rectangle's area is " + rectArea);
//            System.out.println("Do you want to continue?");
//            redo = keyboard.next();

        }
    }
}
