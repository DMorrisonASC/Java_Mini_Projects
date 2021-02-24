/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 2/23/2020
 Instructor: Professor Hellsing
 Description: This program is find the sum of all even numbers between two numbers
*/
import java.util.Scanner;
import java.lang.Math;
public class Cylinder {
    public static void main(String[] args) {
        double h; // height
        double r; // length of the radius
        double base_area; // area of base
        double side_area; // area of side
        Scanner scan = new Scanner(System.in); // Scanner for user input

        System.out.println("Enter the length of the radius for the right cylinder in feet: ");
        r = scan.nextDouble();

        System.out.println("Enter the height of the right cylinder in feet: ");
        h = scan.nextDouble();

        base_area = calcBaseArea(r);
        side_area = calcSideArea(r, h);
        System.out.println("Base surface area of the right cylinder is " + base_area
        + " square feet.");

        prntSurfArea(base_area, side_area);
    }

    public static double calcBaseArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    public static double calcSideArea(double r, double h){
        return h * (2.0 * Math.PI * r);
    }
    public static void prntSurfArea(double base_Area, double side_Area) {
        double totalSurfArea = ( 2.0 * (base_Area)) + side_Area; // Total surface area of the cylinder
        System.out.println("The surface area of the side of the cylinder is " + side_Area);
        System.out.println("The surface area of the cylinder is " + totalSurfArea );
    }
}
