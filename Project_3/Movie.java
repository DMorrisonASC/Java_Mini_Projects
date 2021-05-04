/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/25/2021
    Instructor: Professor Hellsing
    Description: A program to maintain a database of a library’s
inventory. This is be a simple database and does not allow querying, but will still contain a primary index and
second indices to store, retrieve, and modify the data in the database.
 */
public class Movie extends Item {
    private double lengthMin;

    Movie (int ID, String type, String name, String genre, int copies, double lengthMin) {
        super(ID, type, name, genre, copies);

        this.lengthMin = lengthMin;
    }

    public double getLengthMin() {
        return lengthMin;
    }

    public void setLengthMin(double lengthMin) {
        this.lengthMin = lengthMin;
    }
}
