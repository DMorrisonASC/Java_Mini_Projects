/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 3/12/2021
 Instructor: Professor Hellsing
 Description: A simulation of a slot machine
*/
import java.lang.Math;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
//        Init all block variables
        double playerMoney = 100;
        double moneyInMachine = 0;
        double betAmount = 1;
        double moneyTransferred;
        double totalLosses = 0;
        boolean continuePlaying = true;
        char choice;
//        Init objects
        Random rand = new Random();
        Scanner scan = new Scanner(System.in); // Scan for user inputs

        String[] symbols = {"Heart", "Spade", "Diamond", "Club", "Bell", "Cherry", "Horseshoe"};
        String[][] slotsArray = new String[3][3];
        System.out.println("Welcome to the slot machine!\n -----------------------------");
        while (continuePlaying) {
            System.out.println("You have $" + playerMoney + " on hand."); // Output money on hand
            System.out.println("Machine balance: $" + moneyInMachine);
            System.out.println("Bet amount: $" + betAmount);
            System.out.println("You can: \nA) Add money \nB) Change bet amount \nC) Play \nD) Cash-out");
            System.out.println("What do you want to do? Choices:");
//          Ask for inputs 'a', 'b', 'c' or 'd'. If it's not keep asking and looping
            choice = scan.next().toLowerCase().charAt(0);
            while ( choice != 'a' && choice != 'b' && choice != 'c' && choice != 'd') {
                System.out.println("Invalid Choice. Pick 'A', 'B', 'C' or 'D': ");
                choice = scan.next().toLowerCase().charAt(0);
            }

            switch (choice) {

                case 'a':
                    moneyTransferred = addMoney(playerMoney);

                    playerMoney -= moneyTransferred;
                    moneyInMachine += moneyTransferred;
                    totalLosses += moneyTransferred;

                    System.out.println(moneyInMachine);
                    System.out.println(playerMoney);
                    System.out.println(totalLosses);
                    break;
                case 'b':
                    System.out.println("Nothing!2");
                    break;
                case 'c':
                    System.out.println("Nothing!3");
                    break;
                case 'd':
                    continuePlaying = leaveGame(moneyInMachine, totalLosses, playerMoney);
            }
        }

//        Randomly play symbols into each slot
        for (int i = 0; i < slotsArray.length; i++) {
            for (int j = 0; j < slotsArray[i].length; j++) {
                int randIndex = rand.nextInt(7);
                slotsArray[i][j] = symbols[randIndex];
            }

        }
//        Print the spin result
        for (int i = 0; i < slotsArray.length; i++) {
            for (int j = 0; j < slotsArray[i].length; j++) {
                System.out.printf("%10s |", slotsArray[i][j]);
            }
            System.out.println();
        }
    }
//  Adds money to `moneyInMachine` and subtracts from `playerMoney`
    public static double addMoney(double moneyOnHand) {
//        Init objects
        Random rand = new Random();
        Scanner scan = new Scanner(System.in); // Scan for user inputs
        double amountToAdd;
        double newMoneyInMachine = 0;
        System.out.println("Amount to add: ");
        amountToAdd = scan.nextDouble();
//        If amount being add is equal to or less than $0. Keep asking for valid answer
        while (amountToAdd <= 0) {
            System.out.println("Add amount that is greater than $0");
            amountToAdd = scan.nextDouble();
        }
//        If money on hand is less than the amount they are trying to add, keep asking
        while (moneyOnHand < amountToAdd) {
            System.out.println("You don't have enough money");
            amountToAdd = scan.nextDouble();
        }
//        Return the money they would like to add to the machine
        return amountToAdd;
    }

    public static boolean leaveGame(double moneyInMachine, double totalLosses, double playerMoney) {
//        If amount of money in machine is equal to or greater than all the money they put into the machine + bet amount lost,
//        then they made money and won.
//        If not, they lost money.
        if (moneyInMachine >= totalLosses) {
            System.out.println("Your winnings: $" + (moneyInMachine - totalLosses));
        }
        else {
            System.out.println("You lost: $" + (moneyInMachine - totalLosses));
        }
        System.out.println("Current balance: $" + (playerMoney + moneyInMachine));
        System.out.println("Bye, please come again!");
        return false;
    }
}
