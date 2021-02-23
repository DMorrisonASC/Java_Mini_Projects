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
        boolean continueLoop = true;
        String keepGoing;
        System.out.println("This is a grade average calculator. Only use numbers from 0-100!");
//        Ask user to input grades(0-100).
        do {
            gradeInput = scan.nextDouble();
//            Check if number is between 0-100. If not, keep asking
            while (!(0 <= gradeInput && gradeInput <= 100)) {
                    System.out.println("That's not a valid input! Pick another number: ");
                    gradeInput = scan.nextDouble();
            }
            totalGrades = totalGrades + gradeInput;
            numOfGrades++;
            System.out.println("Add another grade? \"Yes\" or \"No\"?");
            keepGoing = scan.next().toLowerCase();

            while (!(keepGoing.startsWith("y") || keepGoing.startsWith("n"))) {
                System.out.println("That's not \"Yes\" or \"No\". ");
                keepGoing = scan.next().toLowerCase();
            }

            if (keepGoing.startsWith("y")) {
                System.out.println("Put in another grade: ");
                continueLoop = true;
            }
            else {
                finalGrade = (totalGrades / numOfGrades);
                System.out.println("Your grade average is " + finalGrade);
                continueLoop = false;
            }
        }
//      Keep asking until keepGoing = false
        while (continueLoop);
    }
}
