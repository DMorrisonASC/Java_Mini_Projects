/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 2/15/2020
 Instructor: Professor Hellsing
 Description: This program is find the sum of all even numbers between two numbers
*/
import java.util.Scanner;
public class RandomNum {
    public static void main(String[] args) {
//        Declare variables
        int miniValue;
        int maxValue = 0;
        int totalValue = 0;
//        Get scanner object to receive from terminal
        Scanner scan = new Scanner(System.in);
//        Ask for two numbers
        System.out.println("Even number calculator! Calculate the sum of all even numbers between two inputs.");
        System.out.println("Use a number between 1-10");
        miniValue = scan.nextInt();
//        Keeps asking for valid input(number between 1-10)
        while (!( 0 <= miniValue && miniValue <= 10)) {
            System.out.println("Not valid, a number between 1-10!");
            miniValue = scan.nextInt();
        }
        System.out.println("Use a number between 11-20");
        maxValue = scan.nextInt();
//        Keeps asking for valid input(number between 11-20)
        while (!( 11 <= maxValue && maxValue <= 20)) {
            System.out.println("Not valid, a number between 11-20!");
            maxValue = scan.nextInt();
        }
//        For loop that runs x amount of times between minValue and maxValue. Ex. 1-11 runs 11 times.
        for ( int i = miniValue; i <= maxValue; i++){
            System.out.println(i);
//            If num is even, add it to totalValue
            if (i % 2 == 0) {
                totalValue = totalValue + i;
            }
        }
//        Print sum of all even numbers.
        System.out.println("The sum of all even numbers between " + miniValue + " and " + maxValue + " is " + totalValue + "!");
    }
}
