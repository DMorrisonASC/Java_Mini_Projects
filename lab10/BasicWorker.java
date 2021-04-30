/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/25/2021
    Instructor: Professor Hellsing
    Description: A program to help a small business keep track of its employees. Specifically
one will be inputting employee information, and they determining what the total amount of payroll the
business will need to cover at the end of the week.
 */
public class BasicWorker extends Employee {
//    A private integer to store the worker’s shift: 1 indicates the day shift, 2 indicates the night shift
    private int timeShift = 0;
    private double payRate = 0;
/*
A constructor that takes in a String, two integers, and a double. The first String and
integer should be provided to the superclass’s constructor using the super() method, and
the second integer and double should be used to set the BasicWorker class’s variables
*/
    public BasicWorker(String name, int id, int timeShift, double payRate) {
        super(name, id);
        this.timeShift = timeShift;
        this.payRate = payRate;
    }
    /* An overridden version of the Employee class’s calcPay method, such that it calculates pay
by multiplying the worker’s pay rate by the number of hours worked
*/
    @Override
    double calcPay(int hoursWorked) {
        double payCheck = payRate * hoursWorked;
        return payCheck;
    }
// Getter/setter methods for the class variables
    public int getTimeShift() {
        return timeShift;
    }

    public void setTimeShift(int timeShift) {
        this.timeShift = timeShift;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
