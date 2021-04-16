import java.util.Scanner;

/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/9/2021
    Instructor: Professor Hellsing
    Description: A program that determines what type of input the user has entered,
specifically have they entered an integer value, a floating point value, a String, or just whitespace
*/
public class TypeChecker {
    private static int intInput = 0;
    private static double doubleInput = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your message?: ");
        String userInput = scan.nextLine().trim();
        /* Call tryInt() and if the method return true, output the user’s data as an integer
and tell them the data was interpreted as integer data
• If the data was not integer data, call tryDouble() and if the method return true,
output the user’s data as a double and tell them the data was interpreted as floating
point data
• If the data was neither integer, floating point data, nor only whitespaces, output the
user’s data and tell them it was interpreted as text data
• If the data was only whitespaces, tell the user that they only input whitespaces
        */

        if (tryInt(userInput)) {
            System.out.println(Integer.parseInt(userInput) + " was interpreted an int.");

        }
        else if (tryDouble(userInput)) {
            System.out.println(Double.parseDouble(userInput) + " was interpreted a double.");
        }
        else if (userInput.isEmpty()){
            System.out.println(userInput + " it was interpreted as a string");
        }
        else {
            System.out.println("Your input was only whitespace");
        }
    }
    /* Using a try/catch statement, the method should attempt to parse the String as
an integer, using the appropriate Integer class method, and store it in the
appropriate class scoped variable. If an exception is generated, the method should
return false. Otherwise, the method should return true.
    */
    private static boolean tryInt(String userInput) {
        int userInt;
        try {
            userInt = Integer.parseInt(userInput);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }
    /* Using a try/catch statement, the method should attempt to parse the String as a
double, using the appropriate Double class method, and store it in the appropriate
class scoped variable. If an exception is generated, the method should return false.
Otherwise, the method should return true.
    */
    private static boolean tryDouble(String userInput) {
        double userInt;
        try {
            userInt = Double.parseDouble(userInput);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }
}
