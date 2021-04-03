/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/2/2021
    Instructor: Professor Hellsing
    Description: A `Node` class to store an individual piece of data, a doubly `LinkedList`
class to store the first and last node in the chain and functions associated with the data structure, and a
`Library` class that will be using a `LinkedList` to keep track of the titles of books in the library. The user
should be able to insert new titles, search for titles, remove titles, and output all of the titles in the library.
*/
public class Node {
private String titleOfBook;
private Node nextNode;
private Node previousNode;

public Node(String title, Node nextNode, Node prevNode) {
 titleOfBook = title;
 this.nextNode = nextNode;
 previousNode = prevNode;

}

    public String getTitleOfBook() {
        return titleOfBook;
    }

    public void setTitleOfBook(String titleOfBook) {
        this.titleOfBook = titleOfBook;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }
}
