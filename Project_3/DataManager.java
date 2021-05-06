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
            foundItem.setCopies(foundItem.getCopies() - 1);
            System.out.println("You check in " + foundItem.getName());
        }
        else if (foundItem instanceof Music) {
            foundItem.setCopies(foundItem.getCopies() - 1);
            System.out.println("You check in " + foundItem.getName());
        }
        else if (foundItem instanceof Movie) {
            foundItem.setCopies(foundItem.getCopies() - 1);
            System.out.println("You check in " + foundItem.getName());
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
            foundItem.setCopies(foundItem.getCopies() - 1);
            System.out.println("You check in " + foundItem.getName());
        }
        else if (foundItem instanceof Music) {
            foundItem.setCopies(foundItem.getCopies() - 1);
            System.out.println("You check in " + foundItem.getName());
        }
        else if (foundItem instanceof Movie) {
            foundItem.setCopies(foundItem.getCopies() - 1);
            System.out.println("You check in " + foundItem.getName());
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
//                    8,Book,Where the Sidewalk Ends,Shel Silverstein,Poetry,176,0
            System.out.println("ID: " + foundItem.getID());
            System.out.println("Type: " + foundItem.getType());
            System.out.println("Name: " + foundItem.getName());
            System.out.println("Author: " + ((Book) foundItem).getAuthorName());
            System.out.println("Genre: " + foundItem.getGenre());
            System.out.println("Number of pages: " + ((Book) foundItem).getNumPages());
            System.out.println("Copies available: " + foundItem.getCopies());
        }
        else if (foundItem instanceof Music) {
//68,Music,Pet Sounds,The Beach Boys,Beach Rock,13,2
            System.out.println("ID: " + foundItem.getID());
            System.out.println("Type: " + foundItem.getType());
            System.out.println("Name: " + foundItem.getName());
            System.out.println("Artist: " + ((Music) foundItem).getArtist());
            System.out.println("Genre: " + foundItem.getGenre());
            System.out.println("Number of songs: " + ((Music) foundItem).getNumSongs());
            System.out.println("Copies available: " + foundItem.getCopies());
        }
        else if (foundItem instanceof Movie) {
//            6,Movie,Titanic,Drama,194,0
            System.out.println("ID: " + foundItem.getID());
            System.out.println("Type: " + foundItem.getType());
            System.out.println("Name: " + foundItem.getName());
            System.out.println("Genre: " + foundItem.getGenre());
            System.out.println("Movie Length: " + ((Movie) foundItem).getLengthMin());
            System.out.println("Copies available: " + foundItem.getCopies());
        }
    }
    public void outPutAllType()  {
        Scanner scan = new Scanner(System.in);
        String inputType;

        System.out.println("Output all books, musics or movies?: ");
        inputType = scan.nextLine();

        if (inputType.equals("Book")) {
            for (Item eachItem : itemHashMap.values()) {
                if (eachItem instanceof Book) {
                    System.out.println("ID: " + eachItem.getID());
                    System.out.println("Type: " + eachItem.getType());
                    System.out.println("Name: " + eachItem.getName());
                    System.out.println("Author: " + ((Book) eachItem).getAuthorName());
                    System.out.println("Genre: " + eachItem.getGenre());
                    System.out.println("Number of pages: " + ((Book) eachItem).getNumPages());
                    System.out.println("Copies available: " + eachItem.getCopies());
                    System.out.println("------------------- ");
                }
            }

        }
        else if (inputType.equals("Music")) {

        }
        else if (inputType.equals("Movie")) {

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
//            System.out.println(typeOfItem);

            if (typeOfItem.equals("Book")) {
//                63,Book,Animal Farm,George Orwell,Satire,122,2
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
//                23,Music,Thriller,Michael Jackson,Pop,9,3
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
//                82,Movie,Sunset Blvd,Drama,110,1
                int ID = stringReader.nextInt();
                stringReader.next();
                String name = stringReader.next();
                String genre = stringReader.next();
                double lengthMin = stringReader.nextDouble();
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
}
