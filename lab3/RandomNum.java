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
        System.out.println("Even number calculator! Calculate the sum of all even numbers between two inputs.");
        System.out.println("Use a number between 1-10");
        miniValue = scan.nextInt();
        System.out.println("Use a number between 11-20");
        maxValue = scan.nextInt();

        for ( int i = miniValue; i <= maxValue; i++){
            System.out.println(i);
            if (i % 2 == 0) {
                totalValue = totalValue + i;
            }
        }
        System.out.println("The sum of all even numbers between " + miniValue + " and " + maxValue + " is " + totalValue + "!");
    }
}
