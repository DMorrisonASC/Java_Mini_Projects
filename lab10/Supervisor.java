/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/25/2021
    Instructor: Professor Hellsing
    Description: A program to help a small business keep track of its employees. Specifically
one will be inputting employee information, and they determining what the total amount of payroll the
business will need to cover at the end of the week.
 */
public class Supervisor extends Employee {
    private int level; // A private integer to store the supervisor’s level
    private double payRate; // A private double to store the supervisor’s pay rate
/* A constructor that takes in a String, two integers, and a double. The first String and
integer should be provided to the superclass’s constructor using the super() method, and
the second integer and double should be used to set the Supervisor class’s variables
*/
    public Supervisor (String name, int id, int level, double payRate) {
        super(name, id);
        this.level = level;
        this.payRate =  payRate;
    }
/* An overridden version of the Employee class’s calcPay method, such that it calculates pay
by multiplying the supervisor’s pay rate by the number of hours worked and adds a bonus of
1000.00 multiplied by the supervisor’s level */
    @Override
    double calcPay(int hoursWorked) {
        double payCheck = (payRate * hoursWorked) + (1000.00 * level);
        return payCheck;
    }
// Getter/setter methods for the class variables
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}

