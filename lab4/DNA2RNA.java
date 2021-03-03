/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 3/1/2021
 Instructor: Professor Hellsing
 Description: a loop that iterates through the sentence(msgInput) and checks there are any letters, numbers, whitespaces or special character.
 It counts and prints the amount
*/

import java.util.Scanner;

public class DNA2RNA {
    public static void main(String[] args) {
        CheckDNASeq(GetDNASeq());

    }

    public static String GetDNASeq(){
        Scanner scan = new Scanner(System.in); // Scanner for user input
        String DNAInput = new String();
        System.out.println("What's the DNA sequence?: ");
        DNAInput = scan.next();

        return DNAInput;
    }

    public static String CheckDNASeq(String DNA){
        String DNASeq = DNA;

        for (int i = 0; i < DNASeq.length(); i++) {
            char letter = DNASeq.charAt(i);

        }
        System.out.println(DNASeq);
        return DNA;
    }

}
