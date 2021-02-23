/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 2/15/2020
 Instructor: Professor Hellsing
 Description: This program is calculating averages.
*/
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
//        Greeting message!
        System.out.println("This is a grade average calculator. Only use numbers from 0-100!");
//        Ask user to input grades(0-100).
        do {
            gradeInput = scan.nextDouble();
//            Check if number is between 0-100. If not, keep asking
            while (!(0 <= gradeInput && gradeInput <= 100)) {
                    System.out.println("That's not a valid input! Pick another number: ");
                    gradeInput = scan.nextDouble();
            }
//            Add input to the total grades and count the number of grades
            totalGrades = totalGrades + gradeInput;
            numOfGrades++;
//            Ask if they want to add another grade
            System.out.println("Add another grade? \"Yes\" or \"No\"?");
            keepGoing = scan.next().toLowerCase();
//          Check if answer is starts with "y" or "n". So that answers like "Yes", "Yup", "No" and "Nope" are accepted.
            while (!(keepGoing.startsWith("y") || keepGoing.startsWith("n"))) {
                System.out.println("That's not \"Yes\" or \"No\". ");
                keepGoing = scan.next().toLowerCase();
            }
//            If "yes", re-loop
            if (keepGoing.startsWith("y")) {
                System.out.println("Put in another grade: ");
                continueLoop = true;
            }
//            If "no", print out the average and stop loop.
            else {
                finalGrade = (totalGrades / numOfGrades);
                System.out.println("Your grade average is " + finalGrade);
                continueLoop = false;
            }
        }
//      Keep asking until continueLoop = false
        while (continueLoop);
    }
}
