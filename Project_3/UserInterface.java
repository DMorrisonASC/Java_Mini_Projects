/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/25/2021
    Instructor: Professor Hellsing
    Description: A program to maintain a database of a library’s
inventory. This is be a simple database and does not allow querying, but will still contain a primary index and
second indices to store, retrieve, and modify the data in the database.
 */
import java.io.IOException;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) throws IOException {
        DataManager dataManager = new DataManager();
        boolean keepGoing = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Trexler Library!\n---------------------------");
        while (keepGoing) {
            System.out.println("Menu: \n1) Check-out an item \n2) Check-in an item " +
                    "\n3) Checking item availability \n4) List all information for a particular type of item " +
                    "\n5) Load the inventory file \n6) Save the inventory file \n7) Exit the program \n");
            int choice = scan.nextInt();

            while (!(choice > 0 && 7 > choice )) {
                System.out.println("Invalid number, try again: ");
                choice = scan.nextInt();
            }

            switch (choice){
                case 1:
                    dataManager.checkInItem();
                    break;
                case 2:
                    dataManager.checkOutItem();
                    break;
                case 3:
                    dataManager.searchInventory();
                    break;
                case 4:
                    dataManager.outPutAllType();
                    break;
                case 5:
                    dataManager.loadInventory();
                    break;
                case 6:
                    System.out.println("Yes, memes!");
                    break;
                case 7:
                    System.out.println("Ending program...bye!");
                    keepGoing = false;
                    break;
            }

        }
    }
}
