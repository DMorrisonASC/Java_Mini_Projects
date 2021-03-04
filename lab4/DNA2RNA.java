/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 3/1/2021
 Instructor: Professor Hellsing
 Description: a loop that iterates through the sentence(msgInput) and checks there are any letters, numbers, whitespaces or special character.
 It counts and prints the amount
*/

import java.util.Scanner;

public class DNA2RNA {

    public static void main(String[] args) {
        String getDNA = getDNASeq();
        boolean checkDNA = checkDNASeq(getDNA);
        String convertToRNA = convertDNA(getDNA);

        if (checkDNA == true) {
            System.out.println(convertToRNA);
        }
        else {
            System.out.println("Your DNA sequences contains 1 or more letters that are not A,C,G or T. " +
            "Ending program.");
        }
    }

    public static String getDNASeq(){
        Scanner scan = new Scanner(System.in); // Scanner for user input
        String DNAInput = new String();
        System.out.println("What's the DNA sequence?: ");
        DNAInput = scan.next().toUpperCase();

        return DNAInput;
    }

    public static boolean checkDNASeq(String DNA){
        String DNASeq = DNA;
        boolean validDNASeq = true;

        for (int i = 0; i < DNASeq.length(); i++) {
            char letter = DNASeq.charAt(i);

            if (letter == 'A' || letter == 'C' || letter == 'G' || letter == 'T') {
                ;
            }
            else {
                validDNASeq = false;
            }
        }
        return validDNASeq;
    }
    public static String convertDNA(String DNA) {
        String RNASeq = DNA.replace('T', 'U');
        return RNASeq;
    }

}
