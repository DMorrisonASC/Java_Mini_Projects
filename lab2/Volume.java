/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 2/15/2020
 Instructor: Professor Hellsing
 Description: This program calculates the area of a rectangle via user inputs
*/

import java.util.Scanner; // To be able to read from keyboard
public class Volume {
    public static void main (String [] args) {
    final double PI = 3.1415;
    String shapeInput;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Do you want to calculate the volume of a 1)sphere, 2) cylinder, or 3) cone?: ");
    shapeInput = keyboard.nextLine();
    if (shapeInput.equals("sphere") || shapeInput.equals("1")) {
        System.out.print(shapeInput);
    }
    else if (shapeInput.equals("cylinder") || shapeInput.equals("2")) {
        System.out.print(shapeInput);
    }
    else if (shapeInput.equals("cone") || shapeInput.equals("3")) {
        System.out.print(shapeInput);
    }

//    System.out.print(shapeInput);
// || shapeInput.startsWith("sphere")
    }
}
