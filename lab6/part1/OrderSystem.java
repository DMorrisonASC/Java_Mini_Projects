/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 3/24/2021
    Instructor: Professor Hellsing
    Description: A program that prompts a user for information regarding an order for a
    product. Once the order is complete, your program should then calculate the total cost of the order and
    report that information back to the user.
*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class OrderSystem {
    public static void main(String[] args) {
//        Init vars
        Scanner scan = new Scanner(System.in);
        Product product = new Product();
//        Library that formats decimals to a requested space. This case formats to 0.00
        DecimalFormat df2 = new DecimalFormat("#.##");
//      Ask user for name and amount of the product they want
        System.out.println("What's the name of the product?: ");
        product.setName(scan.nextLine());
        System.out.println("How many do you want?: ");
        product.setunitsOrdered(scan.nextInt());
        product.setPrice(9.99); // Set the price to 9.99 for any product

        calcTotal(product);

        System.out.println("Product name: " + product.getName());
        System.out.println("Ordered " + product.getName() + "(s) " + product.getunitsOrdered());
        System.out.println("Each cost $" + df2.format(product.getPrice()));
        System.out.println("Total cost of order is $" + df2.format(product.getTotalPrice()));

    }
    /* A private method named calcTotal that returns nothing and take a Product object as a
        parameter. The method calculates the total cost of the order using the information from
        the Product object and then store the total cost in variable in the Product object.
*/
    private static void calcTotal(Product aProduct){
//        Get price of each product and number of products ordered
        double pricePerProduct = aProduct.getPrice();
        int numOfOrders = aProduct.getunitsOrdered();
//        Total cost is price of each product times the amount user requested
        double totalCost = pricePerProduct * numOfOrders;
        aProduct.setTotalPrice(totalCost);
    }
}
