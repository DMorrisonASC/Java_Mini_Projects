/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/2/2021
    Instructor: Professor Hellsing
    Description: A `Node` class to store an individual piece of data, a doubly `LinkedList`
class to store the first and last node in the chain and functions associated with the data structure, and a
`Library` class that will be using a `LinkedList` to keep track of the titles of books in the library. The user
should be able to insert new titles, search for titles, remove titles, and output all of the titles in the library.
*/
public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
    }

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