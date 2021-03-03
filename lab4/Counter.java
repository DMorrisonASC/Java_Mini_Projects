/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 3/1/2021
 Instructor: Professor Hellsing
 Description: a loop that iterates through the sentence(msgInput) and checks there are any letters, numbers, whitespaces or special character.
 It counts and prints the amount
*/

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
//        Create Variables
        Scanner scan = new Scanner(System.in); // Scanner for user input
        String msgInput = new String();
        int letterCount = 0;
        int numberCount = 0;
        int whitespaceCount = 0;
        int specCharCount = 0;

        System.out.println("This is message counter! It counts g the number of letters, digits, whitespaces and special " +
                "characters in a message");
        System.out.println("What's your message?: ");
        msgInput = scan.nextLine();
//        Run a loop that iterates through the sentence(msgInput) 
//        and checks there are any letters, numbers, whitespaces or special character
//        and counts them
        for (int i = 0; i < msgInput.length(); i++) {
            char letter = msgInput.charAt(i);
            if (Character.isLetter(letter)) {
                letterCount++;
            }
            else if (Character.isDigit(letter)) {
                numberCount++;
            }
            else if (Character.isWhitespace(letter)) {
                whitespaceCount++;
            }
            else {
                specCharCount++;
            }
        }
        System.out.println("There are " + letterCount + " letters");
        System.out.println("There are " + numberCount + " numbers");
        System.out.println("There are " + whitespaceCount + " whitespaces");
        System.out.println("There are " + specCharCount + " special characters");
    }
}
