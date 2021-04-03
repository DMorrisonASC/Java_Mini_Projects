import java.util.Scanner;

/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/2/2021
    Instructor: Professor Hellsing
    Description: A `Node` class to store an individual piece of data, a doubly `LinkedList`
class to store the first and last node in the chain and functions associated with the data structure, and a
`Library` class that will be using a `LinkedList` to keep track of the titles of books in the library. The user
should be able to insert new titles, search for titles, remove titles, and output all of the titles in the library.
*/
//a class named Library to keep track of the book titles in a
//        library.
public class Library {
    public static void main(String[] args) {
//        A single instance of a LinkedList object to store the book titles
        LinkedList booksInStock =  new LinkedList();
        Scanner scan = new Scanner(System.in);
        String bookTitle = new String();
        boolean keepGoing = true;
//      A loop that outputs a menu of options regarding the library (add titles, search for titles,
//remove titles, output all titles, quit), prompts the user for which option they would like,
//and uses a switch to take the appropriate actions OR quits the loop if they select quit.
        while (keepGoing) {
            System.out.println("Menu:");
            System.out.println("1) Add titles");
            System.out.println("2) Search titles");
            System.out.println("3) Remove titles");
            System.out.println("4) Outputs all titles ");
            System.out.println("5) Quit/End the program");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please insert a book by title: ");
                    scan = new Scanner(System.in);
                    bookTitle = scan.nextLine();
                    booksInStock.insert(bookTitle);
                    break;
                case 2:
                    System.out.println("What's the title to search?: ");
                    scan = new Scanner(System.in);
                    bookTitle = scan.nextLine();
//                    If the book title is searched for and found/not found, the user should be informed that
//                  the book exists/does not exist
                    if (booksInStock.search(bookTitle)) {
                        System.out.println( "\"" + bookTitle +"\"" + " was found");
                    }
                    else {
                        System.out.println("\"" + bookTitle +"\"" + " does not exist");
                    }
                    break;
                case 3:
                    System.out.println("What title to remove?: ");
                    scan = new Scanner(System.in);
                    bookTitle = scan.nextLine();
//                  If the book title is attempted to be deleted and is/is not deleted, the user should be
//                      informed that the book title was delete/not deleted
                    if (booksInStock.remove(bookTitle)) {
                        System.out.println("\"" + bookTitle +"\"" + " was deleted");
                    }
                    else {
                        System.out.println( "\"" + bookTitle +"\"" + " does not exist");
                    }
                    break;
                case 4:
                    booksInStock.outputTitles();
                    break;
                case 5:
                    System.out.println("End program....");
                    keepGoing = false;
                    break;
            }
        }
    }
}
