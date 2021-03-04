/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 3/1/2021
 Instructor: Professor Hellsing
 Description: Program converts DNA to RNA
*/

import java.util.Scanner;

public class DNA2RNA {

    public static void main(String[] args) {
        String getDNA = getDNASeq(); // Get user's input
        boolean checkDNA = checkDNASeq(getDNA); // Check if it's a valid string
        String convertToRNA = convertDNA(getDNA); // If yes, convert it to RNA and store new string
//        If DNA is valid(contains only "A", "C", "G" or "T", output the DNA and RNA sequence.
        if (checkDNA == true) {
            System.out.println("The DNA sequence " + getDNA + ", when converted to RNA is " + convertToRNA);
        }
//        If not valid, exit program
        else {
            System.out.println("Your DNA sequences contains 1 or more letters that are not A,C,G or T. \n" +
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
    // Check user's input
    public static boolean checkDNASeq(String DNA){
        String DNASeq = DNA;
        boolean validDNASeq = true;

        for (int i = 0; i < DNASeq.length(); i++) {
            char letter = DNASeq.charAt(i);
//            If appropriate letter are used, do nothing
            if (letter == 'A' || letter == 'C' || letter == 'G' || letter == 'T') {
                ;
            }
//            If a letter is not A, C, G, or T. Return false
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
