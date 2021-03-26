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
public class SmartOrderSystem {
    public static void main(String[] args) {
//        Init vars
        Scanner scan = new Scanner(System.in);
        SmartProduct[] arrayOfProducts;
        DecimalFormat df2 = new DecimalFormat("#.##"); // Library that formats decimals to a requested space. This case formats to 0.00

//      Prompt the user for how many products they wish to order, and then allocate space for
//      an array of that size
        System.out.println("How many products are you ordering? :");
        arrayOfProducts = new SmartProduct[scan.nextInt()];
        for (int i = 0; i < arrayOfProducts.length; i++) {
            scan = new Scanner(System.in);
            SmartProduct product = new SmartProduct();

            product.setProductID(i);
            System.out.println("What's the product?: ");
            product.setName(scan.nextLine());
            System.out.println("How many?: ");
            product.setunitsOrdered(scan.nextInt());
            product.setPrice(9.99);

            arrayOfProducts[i] = product;
        }

        for (int i = 0; i < arrayOfProducts.length; i++) {
            System.out.println("-----------------------");
            System.out.println("You ordered: ");
            System.out.println("Name: " + arrayOfProducts[i].getName());
            System.out.println("Unique ID: " + arrayOfProducts[i].getProductID());
            System.out.println("Amount: " + arrayOfProducts[i].getunitsOrdered());
            System.out.println("Price of each: $" + df2.format(arrayOfProducts[i].getPrice()) );
        }
        System.out.println("----------\nTotal Cost: $" + df2.format(calcTotal(arrayOfProducts)) );
    }
    /* A private method named calcTotal that returns nothing and take a Product object as a
        parameter. The method calculates the total cost of the order using the information from
        the Product object and then store the total cost in variable in the Product object.
    */
    private static double calcTotal(SmartProduct[] smartProducts){
//        Get price of each product and number of products ordered
        double totalCost = 0;
        for (int i = 0; i < smartProducts.length; i++) {
            double eachPrice = smartProducts[i].getPrice();
            totalCost += eachPrice;
        }
        return totalCost;
    }
}
