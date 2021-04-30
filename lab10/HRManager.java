import java.util.Scanner;

/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 4/25/2021
    Instructor: Professor Hellsing
    Description: A program to help a small business keep track of its employees. Specifically
one will be inputting employee information, and they determining what the total amount of payroll the
business will need to cover at the end of the week.
 */
// A class named HRManager which will manage the employees
//of a small company
public class HRManager {
    public static void main(String[] args) {
        Employee[] allEmployees;

        Scanner scan = new Scanner(System.in);
        System.out.println("How many employees to add?: ");
        allEmployees = new Employee[scan.nextInt()];

        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println("Add \n1) supervisor \nor \n2) worker?: ");
            int answer = scan.nextInt();

            while(!(answer == 1 || answer == 2)) {
                System.out.println("Input incorrect, try again: ");
                answer = scan.nextInt();
            }
            scan.nextLine(); // Clear scanner's buffer
            switch (answer){
                case 1:
                    System.out.println("Name: ");
                    String supervisorName = scan.nextLine();
                    System.out.println("ID: ");
                    int supervisorID = scan.nextInt();
                    System.out.println("Pay rate: ");
                    double supervisorPayRate = scan.nextDouble();
                    System.out.println("Supervisor Level: ");
                    int supervisorLevel = scan.nextInt();

                    allEmployees[i] = new Supervisor(supervisorName, supervisorID, supervisorLevel, supervisorPayRate);
                    break;

                case 2:
                    System.out.println("Name: ");
                    String workerName = scan.nextLine();
                    System.out.println("ID: ");
                    int workerID = scan.nextInt();
                    System.out.println("Pay rate: ");
                    double workerPayRate = scan.nextDouble();
                    System.out.println("1) Day Shift or 2) Night shift: ");
                    int workerShift = scan.nextInt();

                    allEmployees[i] = new BasicWorker(workerName, workerID, workerShift, workerPayRate);
                    break;
            }
        }

        listEmployees(allEmployees);
        System.out.println(calcTotalPay(allEmployees));
    }

    private static double calcTotalPay(Employee[] arrayOfEmployees) {
        double payForAllWorkers = 0;
        for (int i = 0; i < arrayOfEmployees.length; i++) {
//            Get one employee check if they are a basic worker or supervisor
            if (arrayOfEmployees[i] instanceof Supervisor) {
            Supervisor supervisor = (Supervisor) arrayOfEmployees[i];
            payForAllWorkers += supervisor.calcPay(40);
            }

            else if (arrayOfEmployees[i] instanceof BasicWorker) {
                BasicWorker basicWorker = (BasicWorker) arrayOfEmployees[i];
                payForAllWorkers += basicWorker.calcPay(40);
            }
        }
        return payForAllWorkers;
    }

    private static void listEmployees(Employee[] employeeArray) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] instanceof Supervisor) {
                Supervisor temp = (Supervisor)employeeArray[i];
                System.out.println("Name: " + employeeArray[i].getName());
                System.out.println("ID: " + temp.getId());
                System.out.println("Pay Rate: $" + temp.getPayRate());
                System.out.println("Level: " + temp.getLevel());
            }

            else if (employeeArray[i] instanceof BasicWorker) {
                BasicWorker temp = (BasicWorker)employeeArray[i];
                System.out.println("Name: " + employeeArray[i].getName() );
                System.out.println("ID: " + temp.getId());
                System.out.println("Pay Rate: $" + temp.getPayRate());
                if (temp.getTimeShift() == 1) {
                    System.out.println("Shift: Day Shift");
                }
                else if (temp.getTimeShift() == 2) {
                    System.out.println("Shift: Night Shift");
                }
            }
        }
    }
}