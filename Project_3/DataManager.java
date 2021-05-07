/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/25/2021
    Instructor: Professor Hellsing
    Description: A program to maintain a database of a library’s
inventory. This is be a simple database and does not allow querying, but will still contain a primary index and
second indices to store, retrieve, and modify the data in the database.

Note: While the number of copies of items may increase and decrease, even to 0, new items
cannot be added and current items cannot be deleted. The library’s collection is set
once the initial inventory file is loaded in.
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class DataManager {
    HashMap<Integer, Item>  itemHashMap = new HashMap<Integer, Item>(); // A HashMap of type Item to store all of the items in the library as the primary index
//    Three LinkedLists, one of type Book, one of type Music, and one of type Movie to store.
    LinkedList<Book> bookLinkedList = new LinkedList<Book>();
    LinkedList<Music> musicLinkedList = new LinkedList<Music>();
    LinkedList<Movie> movieLinkedList = new LinkedList<Movie>();

    public DataManager(){}

    public void checkInItem() {
        Scanner scan = new Scanner(System.in);
        int inputID = 0;

        System.out.println("What's the item's ID#?: ");
        inputID = scan.nextInt();
        Item foundItem = itemHashMap.get(inputID);
        System.out.println(foundItem.getName());
/* If the ID does not exist in the HashMap, an appropriate message should be
output to the user
*/
        if (itemHashMap.get(inputID) == null) {
            System.out.println("Not item on file with that ID. Try again: ");
        }
/* If the ID exists in the HashMap the number of copies should increase by 1 and
an appropriate message should be output to the user.
*/
        if (foundItem instanceof Book) {
            foundItem.setCopies(foundItem.getCopies() + 1);
            System.out.println("You checked in " + foundItem.getName());
        }
        else if (foundItem instanceof Music) {
            foundItem.setCopies(foundItem.getCopies() + 1);
            System.out.println("You checked in " + foundItem.getName());
        }
        else if (foundItem instanceof Movie) {
            foundItem.setCopies(foundItem.getCopies() + 1);
            System.out.println("You checked in " + foundItem.getName());
        }
    }

    public void checkOutItem() {
        Scanner scan = new Scanner(System.in);
        int inputID = 0;

        System.out.println("What's the item's ID#?: ");
        inputID = scan.nextInt();
        Item foundItem = itemHashMap.get(inputID);
        System.out.println(foundItem.getName());
/* If the ID does not exist in the HashMap, an appropriate message should be
output to the user
*/
        if (itemHashMap.get(inputID) == null) {
            System.out.println("Not item on file with that ID. Try again: ");
        }
/* If the ID exists in the HashMap the number of copies should increase by 1 and
an appropriate message should be output to the user.
*/
        if (foundItem instanceof Book) {
            if (foundItem.getCopies() > 0) {
                foundItem.setCopies(foundItem.getCopies() - 1);
                System.out.println("You checked out " + foundItem.getName());
            }
            else {
                System.out.println("Item is currently unavailable");
            }
        }
        else if (foundItem instanceof Music) {
            if (foundItem.getCopies() > 0) {
                foundItem.setCopies(foundItem.getCopies() - 1);
                System.out.println("You checked out " + foundItem.getName());
            }
            else {
                System.out.println("Item is currently unavailable");
            }
        }
        else if (foundItem instanceof Movie) {
            if (foundItem.getCopies() > 0) {
                foundItem.setCopies(foundItem.getCopies() - 1);
                System.out.println("You checked out " + foundItem.getName());
            }
            else {
                System.out.println("Item is currently unavailable");
            }
        }
    }

    public void searchInventory() {
        Scanner scan = new Scanner(System.in);
        int inputID;

        System.out.println("What's the item's ID#?: ");
        inputID = scan.nextInt();
        Item foundItem = itemHashMap.get(inputID);
/* If the ID does not exist in the HashMap, an appropriate message should be
output to the user
*/
        if (itemHashMap.get(inputID) == null) {
            System.out.println("No item on file with that ID. ");
        }
/* If the ID exists in the HashMap the Item’s information, including its current
number of copies, should be output to the user with an appropriate message */
        if (foundItem instanceof Book) {
            System.out.println("ID: " + foundItem.getID());
            System.out.println("Type: " + foundItem.getType());
            System.out.println("Name: " + foundItem.getName());
            System.out.println("Author: " + ((Book) foundItem).getAuthorName());
            System.out.println("Genre: " + foundItem.getGenre());
            System.out.println("Number of pages: " + ((Book) foundItem).getNumPages());
            System.out.println("Copies available: " + foundItem.getCopies());
        }
        else if (foundItem instanceof Music) {
            System.out.println("ID: " + foundItem.getID());
            System.out.println("Type: " + foundItem.getType());
            System.out.println("Name: " + foundItem.getName());
            System.out.println("Artist: " + ((Music) foundItem).getArtist());
            System.out.println("Genre: " + foundItem.getGenre());
            System.out.println("Number of songs: " + ((Music) foundItem).getNumSongs());
            System.out.println("Copies available: " + foundItem.getCopies());
        }
        else if (foundItem instanceof Movie) {
            System.out.println("ID: " + foundItem.getID());
            System.out.println("Type: " + foundItem.getType());
            System.out.println("Name: " + foundItem.getName());
            System.out.println("Genre: " + foundItem.getGenre());
            System.out.println("Movie Length: " + ((Movie) foundItem).getLengthMin());
            System.out.println("Copies available: " + foundItem.getCopies());
        }
    }
    /*  A method that allows the user to see all of the Items of a particular type that the library
current keeps track of
▪ This method should prompt the user for which type of Item they wish to see and
output all of the information for each of Items in the appropriate secondary index, in
an easy to read format with appropriate headers for each piece of information
    */
    public void outPutAllType()  {
        Scanner scan = new Scanner(System.in);
        String inputType;

        System.out.println("Output all books, musics or movies?: ");
        inputType = scan.nextLine();

        if (inputType.toLowerCase().startsWith("b")) {
            for (Book eachItem : bookLinkedList) {
                System.out.println("ID: " + eachItem.getID());
                System.out.println("Type: " + eachItem.getType());
                System.out.println("Name: " + eachItem.getName());
                System.out.println("Author: " + eachItem.getAuthorName());
                System.out.println("Genre: " + eachItem.getGenre());
                System.out.println("Number of pages: " + eachItem.getNumPages());
                System.out.println("Copies available: " + eachItem.getCopies());
                System.out.println("-------------------");
            }

        }

        else if (inputType.toLowerCase().startsWith("mu")) {
            for (Music eachItem : musicLinkedList) {
                System.out.println("ID: " + eachItem.getID());
                System.out.println("Type: " + eachItem.getType());
                System.out.println("Name: " + eachItem.getName());
                System.out.println("Artist: " + eachItem.getArtist());
                System.out.println("Genre: " + eachItem.getGenre());
                System.out.println("Number of songs: " + eachItem.getNumSongs());
                System.out.println("Copies available: " + eachItem.getCopies());
                System.out.println("-------------------");
            }
        }

        else if (inputType.toLowerCase().startsWith("mo")) {
            for (Movie eachItem : movieLinkedList) {
                System.out.println("ID: " + eachItem.getID());
                System.out.println("Type: " + eachItem.getType());
                System.out.println("Name: " + eachItem.getName());
                System.out.println("Genre: " + eachItem.getGenre());
                System.out.println("Movie Length: " + eachItem.getLengthMin());
                System.out.println("Copies available: " + eachItem.getCopies());
                System.out.println("-------------------");
            }
        }
    }
/*  A method that allows the user to load a file that contains the library’s current inventory of
Items
▪ This method should prompt the user for the name of the file and take appropriate
actions to setup the file for reading
▪ Each line in the file will contain one Item and will be formatted as follows
• A line that contains a book will be formatted as:
o ID,Type,BookName,Author,Genre,NumPages,Copies
• A line that contains music will be formatted as:
o ID,Type,AlbumName,Artist,Genre,NumSongs,Copies
• A line that contains a movie will be formatted as:
o ID,Type,MovieName,Genre,LengthMin,Copies
• Type represents the type of Item, and can be either “Book”, “Music”, or “Movie” */
    public void loadInventory() throws IOException {
        System.out.println("What's the name of the file?: ");
        Scanner scan = new Scanner(System.in);
        File fileName = new File(scan.nextLine());

        while (fileName.exists() == false) {
            System.out.println("File does not exist. What's the name of the file to load?: ");
            fileName = new File(scan.nextLine());
        }

        Scanner myFile = new Scanner(fileName);

        while (myFile.hasNextLine()) {
            String line = myFile.nextLine();
            Scanner typeReader = new Scanner(line);
            Scanner stringReader = new Scanner(line);
            typeReader.useDelimiter(",");
            stringReader.useDelimiter(",");
//          First, check if line is a book, music, or movie
            typeReader.next();
            String typeOfItem = typeReader.next();

            if (typeOfItem.equals("Book")) {
              int ID = stringReader.nextInt();
              stringReader.next();
              String name = stringReader.next();
              String author = stringReader.next();
              String genre = stringReader.next();
              int numPages = stringReader.nextInt();
              int copies = stringReader.nextInt();

              Book oneBook = new Book(ID, typeOfItem, name, genre, copies, author, numPages);
              bookLinkedList.add(oneBook);
              itemHashMap.put(ID, oneBook);
            }
            else if (typeOfItem.equals("Music")){
                int ID = stringReader.nextInt();
                stringReader.next();
                String name = stringReader.next();
                String artist = stringReader.next();
                String genre = stringReader.next();
                int numSongs = stringReader.nextInt();
                int copies = stringReader.nextInt();

                Music oneMusic = new Music(ID, typeOfItem, name, genre, copies, artist, numSongs);
                musicLinkedList.add(oneMusic);
                itemHashMap.put(ID, oneMusic);
            }
            else if (typeOfItem.equals("Movie")){
                int ID = stringReader.nextInt();
                stringReader.next();
                String name = stringReader.next();
                String genre = stringReader.next();
                int lengthMin = stringReader.nextInt();
                int copies = stringReader.nextInt();

                Movie oneMovie = new Movie(ID, typeOfItem, name, genre, copies, lengthMin);
                movieLinkedList.add(oneMovie);
                itemHashMap.put(ID, oneMovie);
            }
            else {
                System.out.println("Couldn't read this...");
            }
        }
        myFile.close();
    }
//    A method that allows the user to save a file that contains the library’s current inventory of Items
    public void saveInventory() throws IOException {
//      Output the following information to requested file.
        System.out.println("What's the name of the file?: ");
        Scanner scan = new Scanner(System.in);
        PrintWriter myWriter = new PrintWriter(scan.nextLine());
//        Save a file that contains the library’s current inventory of Items
        for (Book eachItem : bookLinkedList) {
            myWriter.println(eachItem.getID() + "," + eachItem.getType() + "," +
                    eachItem.getName() + "," + eachItem.getAuthorName()  + "," +
                    eachItem.getGenre() + "," + eachItem.getNumPages() + "," +
                    eachItem.getCopies()
            );
        }
        for (Music eachItem : musicLinkedList) {
            myWriter.println(eachItem.getID() + "," + eachItem.getType() + "," +
                            eachItem.getName() + "," + eachItem.getArtist() + "," + eachItem.getGenre()
                            + "," + eachItem.getNumSongs() + "," + eachItem.getCopies()
            );
        }
        for (Movie eachItem : movieLinkedList) {
            myWriter.println(eachItem.getID() + "," + eachItem.getType() + "," + eachItem.getName() + "," +
                            eachItem.getGenre() + "," + eachItem.getLengthMin() + "," + eachItem.getCopies()
            );
        }
        myWriter.close();
    }
}
