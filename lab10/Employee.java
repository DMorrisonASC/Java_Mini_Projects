/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/25/2021
    Instructor: Professor Hellsing
    Description: A program to help a small business keep track of its employees. Specifically
one will be inputting employee information, and they determining what the total amount of payroll the
business will need to cover at the end of the week.
 */
public abstract class Employee {
    protected String name = new String(); // A protected String to store the employee’s name
    protected int id; // A protected integer to store the employee’s ID number.
    /*  A constructor that takes in a String and integer as parameters, and uses them to set the class
variables.
    */
    public Employee(String workerName, int workerID) {
        this.name = workerName;
        this.id = workerID;
    }
    /* An abstract method named calcPay, which takes in an integer representing the number of
hours worked and returns a double.
    */
    abstract double calcPay (int hoursWorked);
//Getter/setter methods for the class variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}