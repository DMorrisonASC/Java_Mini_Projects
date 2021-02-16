/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 2/15/2020
 Instructor: Professor Hellsing
 Description: This program calculates the volume of a 1)sphere, 2) cylinder, or 3) cone via user inputs
*/

import java.util.Scanner; // To be able to read from keyboard
public class Volume {
    public static void main (String [] args) {
    //  Create  a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
    //  Identifier declarations
        final double PI = 3.1415;
        String shapeInput;
        double radius;
        double height;
        double sphereVolume;
        double cylinderVolume;
        double coneVolume;
    //  Ask user which shape they want to calculate and store input
        System.out.print("Do you want to calculate the volume of a 1)sphere, 2) cylinder, or 3) cone?: ");
        shapeInput = keyboard.nextLine();
    //  Run a if statement that calculates chosen shape and outputs volume
    //  Find volume of sphere
        if (shapeInput.equals("sphere") || shapeInput.equals("1")) {
            System.out.print("What's the radius?: ");
            radius = keyboard.nextDouble();
    //  Ask prof why (4/3) is ignored
            sphereVolume = (4.0/3.0) * PI * (Math.pow(radius, 3));
            System.out.print("The volume of this sphere is "+ sphereVolume);
        }
    //  Find volume of cylinder
        else if (shapeInput.equals("cylinder") || shapeInput.equals("2")) {
            System.out.print("What's the radius?: ");
            radius = keyboard.nextDouble();
            System.out.print("What's the height?: ");
            height = keyboard.nextDouble();
            cylinderVolume = PI * (Math.pow(radius, 2) * height);
            System.out.print("The volume of this sphere is "+ cylinderVolume);
        }
    //  Find volume of cone
        else if (shapeInput.equals("cone") || shapeInput.equals("3")) {
            System.out.print("What's the radius?: ");
            radius = keyboard.nextDouble();
            System.out.print("What's the height?: ");
            height = keyboard.nextDouble();
            coneVolume = PI * Math.pow(radius, 2) * (height/3);
            System.out.print("The volume of this sphere is "+ coneVolume);
        }
    //  Inform and end program if user makes incorrect choice
        else {
            System.out.print("That's not an option, ending program.");
        }
    }
}
