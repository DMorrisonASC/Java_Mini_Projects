/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/2/2021
    Instructor: Professor Hellsing
    Description: A `Node` class to store an individual piece of data, a doubly `LinkedList`
class to store the first and last node in the chain and functions associated with the data structure, and a
`Library` class that will be using a `LinkedList` to keep track of the titles of books in the library. The user
should be able to insert new titles, search for titles, remove titles, and output all of the titles in the library.
*/
// A class named LinkedList to store multiple book titles. This
//class should contain
public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
    }
//A method that takes in a String representing a book title as a parameter and inserts the title
//into the Linked List at the end
    public void insert(String title) {
        Node current;

        if(head == null)
        {
            Node newNode = new Node(title, head, tail);
            head = newNode;
        }
        else
        {
            current = head;

            while(current.getNextNode() != null)
            {
                current = current.getNextNode();
            }

            Node newNode = new Node(title, head, tail);
            newNode.setTitleOfBook(title);
            newNode.setNextNode(null);

            current.setNextNode(newNode);
        }

    }
//    A method that takes in a String representing a book title as a parameter and searches for the
//    title is in the LinkedList. The method should return true if the title was in the Linked List
//    and false if not
    public boolean search(String title) {
        Node current = head;

        while (current != null) {
            if (current.getTitleOfBook().equals(title)) {
                return true;
            }
            current = current.getNextNode();
        }
        return false;
    }
//    A method that takes in a String representing a book title as a parameter and deletes the title
//in the LinkedList. The method should return true if the title was successfully deleted from
//the LinkedList and false if not
    public boolean remove(String title)
    {
        if(head == null)
        {
            return false;
        }
        else if(head.getTitleOfBook() == title)
        {
            head = head.getNextNode();
        }
        else
        {
            Node current = head.getNextNode();
            Node previous = head;

            while(current != null)
            {
                if(current.getTitleOfBook().equals(title))
                {
                    previous.setNextNode(current.getNextNode());
                    return true;
                }
                current = current.getNextNode();
                previous = previous.getNextNode();
            }
        }
        return false;
    }
    public void outputTitles(){
        Node current = head;

        while (current != null) {
            System.out.println("\"" + current.getTitleOfBook() + "\"");
            current = current.getNextNode();
        }

    }
}
