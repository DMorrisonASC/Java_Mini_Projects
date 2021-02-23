/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 2/15/2020
 Instructor: Professor Hellsing
 Description: This program is calculating averages.
*/
import java.util.Locale;
import java.util.Scanner; // To be able to read from keyboard
public class Grades {
    public static void main(String[] args) {
//        Create  a Scanner object to read from the keyboard
        Scanner scan = new Scanner(System.in);
//        Declare vars
        double gradeInput;
        double totalGrades = 0;
        double numOfGrades = 0;
        double finalGrade = 0;
        boolean continueLoop;
        String keepGoing;
//        Ask user to input grades(0-100).
        do {
            System.out.println("This is a grade average calculator. Only use numbers from 0-100!");
            gradeInput = scan.nextDouble();
            if (0 <= gradeInput && gradeInput <= 100) {
                totalGrades = totalGrades + gradeInput;
                numOfGrades++;
            }

            else {
                System.out.println("That's not a valid input!");
                continue;
            }
            System.out.println("Add another grade? \"Yes\" or \"No\"?");
            keepGoing = scan.next().toLowerCase();

            if (keepGoing.startsWith("y")) {
                continue;
            }
            else if (keepGoing.startsWith("n")) {
                finalGrade = (totalGrades / numOfGrades);
                System.out.println("Your grade average is " + finalGrade);
                break;
            }
//            else {
//
//            }
        }
//      Keep asking until keepGoing = false
        while (true);
    }
}
