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
        double bet = 1;
        boolean continuePlaying = true;
        char choice;
//        Init objects
        Random rand = new Random();
        Scanner scan = new Scanner(System.in); // Scan for user inputs


        String[] symbols = {"Heart", "Spade", "Diamond", "Club", "Bell", "Cherry", "Horseshoe"};
        String[][] slotsArray = new String[3][3];
        System.out.println("Welcome to the slot machine!\n -----------------------------");
        while (continuePlaying) {
            System.out.println("What do you want to do? Choices:");

            choice = scan.next().toLowerCase().charAt(0);
            System.out.println(choice);
            while ( choice != 'a' && choice != 'b' && choice != 'c' && choice != 'd') {
                System.out.println("Invalid Choice. Pick 'A', 'B', 'C' or 'D': ");
                choice = scan.next().toLowerCase().charAt(0);
            }

            switch (choice) {

                case 'a':
                    System.out.println("Nothing!");
                    break;
                case 'b':
                    System.out.println("Nothing!2");
                    break;
                case 'c':
                    System.out.println("Nothing!3");
                    break;
                case 'd':
                    continuePlaying = false;
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
}
