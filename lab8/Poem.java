import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/2/2021
    Instructor: Professor Hellsing
    Description:
*/
public class Poem {
    public static void main(String[] args) throws IOException {
//        Contain a String variable to store the poem’s title
        String title = new String();
//        Contain a String variable to store the poem’s author
        String author = new String();
//        Contain a ArrayList of String variables to store the lines of the poem
        ArrayList<String> poemLines = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
//      Prompt the user for the name of the file they wish to have read in and summarized and
//store it
        System.out.println("What's the name of the file to store?: ");
        File fileName = new File(scan.nextLine());

        while (fileName.exists() == false) {
            System.out.println("File does not exist. What's the name of the file to store?: ");
            fileName = new File(scan.nextLine());
        }

        Scanner fileInput = new Scanner(fileName);

        int lineNumber = 0;
        while (fileInput.hasNextLine()) {
            lineNumber++;
//            Read the first line of the file and store it in the appropriate variable
            if (lineNumber == 1) {
                title = fileInput.nextLine();
            }
//            Read the second line of the file and store it in the appropriate variable
            else if(lineNumber == 2) {
                author = fileInput.nextLine();
            }
//            Read in all other lines of the file and add each one to the ArrayList
            else {
                poemLines.add(fileInput.nextLine());
            }
        }

        fileInput.close();

        PrintWriter myWriter = new PrintWriter("Output.txt");
//        Output the following information to Output.txt
//        - The name of the poem
//        - The author of the poem
//        - The number of lines in the poem
//        - The first three lines of the poem to provide a preview of the poem
        myWriter.println("The title of the poem is " + title);
        myWriter.println("The Author of the poem is " + author);
        myWriter.println("The number of lines in the poem is " + poemLines.size());
        myWriter.println("A preview of the poem is :");
        for (int i = 0; i < poemLines.size() - 4; i++) {
            myWriter.println(poemLines.get(i));
        }
        myWriter.close();
    }
}
