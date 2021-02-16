/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 2/15/2020
 Instructor: Professor Hellsing
 Description: This program is a single-question quiz that uses switch statement to print different outcome.
*/
import java.util.Scanner;

public class Switch {
    public static void main (String[] args){
//        Set variables
        char choice;
//        set Scanner for inputs via terminal
        Scanner scan = new Scanner(System.in);
//        Create quiz
        System.out.println("Welcome to the 111 quiz. Please choose the correct answer to the following question: ");
        System.out.println("Which planet in our solar system is on average farthest away from the sun?");
        System.out.println("A. Mercury");
        System.out.println("B. Jupiter");
        System.out.println("C. Neptune");
        System.out.println("D. Saturn");
        System.out.println("E. Pluto");
        System.out.println("Please enter your choice (A, B, C, D, or E): ");
//        get user's answer.
        choice = scan.next().toLowerCase().charAt(0);
//        Output of switch statement changes based on input
        switch (choice) {
            case 'a':
                System.out.println("This is incorrect! Neptune is the planet farthest away from the sun.");
                break;
            case 'b':
                System.out.println("This is incorrect! Neptune is the planet farthest away from the sun.");
                break;
            case 'c':
                System.out.println("This is correct! Neptune is the planet farthest away from the sun.");
                break;
            case 'd':
                System.out.println("This is incorrect! Neptune is the planet farthest away from the sun.");
                break;
            case 'e':
                System.out.println("This is incorrect! Pluto is not a planet, but a dwarf.");
                break;
            default:
                System.out.println("That is not a valid choice.");
                break;
        }

        System.out.println("Good Bye!");
    }
}
