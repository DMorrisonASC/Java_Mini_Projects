import java.util.Scanner;

/* Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
 Date: 3/1/2021
 Instructor: Professor Hellsing
 Description:  a program that allows a user to enter the height, in inches, of 8 people in a
room, determine the average of the heights, and then output the average along with all of the heights.
*/
public class Height {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scan for user input
        int numOfPeople = 8;
        int[] heightArray  = new int[numOfPeople];

//        for (int i = 0; i < heightArray.length; i++) {
//            int heightInput = scan.nextInt();
//            heightArray[i] = heightInput;
//            scan.nextLine();
//        }
        int[] newHeightArray = getHeight(heightArray);

        for ( int num : heightArray){
            int total = 0;
            int count = 0;

            count += 1;
            total += num;

            double avgHeight = total / count;
        }

        for (int num : heightArray ) {
            System.out.println(num);
        }
        System.out.println(heightArray[1]);

    }
    public static int[] getHeight(int[] heightArray) {
        Scanner scan = new Scanner(System.in); // Scan for user input
        for (int i = 0; i < heightArray.length; i++) {
            int heightInput = scan.nextInt();
            heightArray[i] = heightInput;
            scan.nextLine();
        }
        return heightArray;
    }
    public static int 

}
