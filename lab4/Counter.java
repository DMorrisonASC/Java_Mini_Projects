/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 3/1/2021
 Instructor: Professor Hellsing
 Description: This program is find the sum of all even numbers between two numbers
*/

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
//        Create Variables
        Scanner scan = new Scanner(System.in); // Scanner for user input
        String msgInput = new String();
        int letterCount = 0;
        int numberCount = 0;
        int specCharCount = 0;

        System.out.println("This is message counter! It counts g the number of letters, digits, whitespaces and special " +
                "characters in a message");
        System.out.println("What's your message?: ");
        msgInput = scan.nextLine();
//        Run a loop that iterates through the sentence(msgInput)
//        for (char letter: msgInput.toCharArray()) {
//            System.out.println(letter);
//            Boolean isLetter = Character.isDigit(mis.charAt(i));
//        }
        for (int i = 0; i < msgInput.length(); i++) {
            char letter = msgInput.charAt(i);
            String letterToString = Character.toString(letter);
//          Return True if char is a NOT special char.
            Boolean isNotSpecChar = !(letterToString.matches("[^a-zA-Z0-9]"));
//           If its NOT a special character count it;
            if(isNotSpecChar) {
//
                letterCount++;

            }
//            if its a special character count it;
            else {
                specCharCount++;
            }
        }
        System.out.println("There are " + letterCount + "letters");
        System.out.println("There are " + numberCount + "numbers");
        System.out.println("There are " + specCharCount + "special characters");
    }
}
