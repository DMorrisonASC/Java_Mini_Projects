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
//
            Boolean isSpecChar = letterToString.matches("[^a-zA-Z0-9]");
            if(isSpecChar) {
//                System.out.println("Not Special Char!");
            }
            else {
//                System.out.println("Special Char!");
            }
//            System.out.println(letter);
        }
    }
}
