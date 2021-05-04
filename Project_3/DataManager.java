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

    public DataManager(){

    }

    public void searchInventory() {
        Scanner scan = new Scanner(System.in);
        int inputID = 0;

        System.out.println("What's the item's ID#?: ");
        inputID = scan.nextInt();
        Item foundItem = itemHashMap.get(inputID);
        System.out.println(foundItem.getName());
//        Keep asking until a correct ID number is given
        while (itemHashMap.get(inputID) == null) {
            System.out.println("Not item on file with that ID. Try again: ");

            System.out.println("What's the item's ID#?: ");
            inputID = scan.nextInt();

            foundItem = itemHashMap.get(inputID);
        }

        if (foundItem instanceof Book) {
            System.out.println("I found a book");
        }
        else if (foundItem instanceof Music) {
            System.out.println("I found a music");

        }
        else if (foundItem instanceof Movie) {
            System.out.println("I found a movie");
        }

    }

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
