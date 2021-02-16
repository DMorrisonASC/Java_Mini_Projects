/* Author: Daeshaun Morrison, class of 2024
 Date: 2/9/2020
 Instructor: Professor Hellsing
 Description: This program calculates the user's gross pay
*/

import java.util.Scanner; // To be able to read from keyboard
public class PayrollCalculator {
    public static void  main (String [] args) {
//        Create  a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
//        Identifier declarations
        double hours; // number of hours worked
        double rate = 15.0;  // hourly pay rate
        double pay; // gross pay

//        display prompt and get input
        System.out.print("How many hours did you work? ");
        hours = keyboard.nextDouble();

//        calculations
        if (hours <= 40){
            pay = hours * rate;
        }
        else {
            pay = (hours - 40) * (1.5 * rate) + 40 * rate;
        }
//        display results
        System.out.println("You earned $" + pay);
    }
}
