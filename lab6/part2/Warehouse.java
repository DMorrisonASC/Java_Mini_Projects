/*
    Author: Daeshaun Morrison, Muhlenberg College class of 2024(daeshaunkmorrison@gmail.com)
    Date: 3/24/2021
    Instructor: Professor Hellsing
    Description: A program that prompts a user for amount of goods they would like to add or remove from the warehouse
*/
import java.util.Scanner;
public class Warehouse {
    private int totalGoodsInStock;
    public int getTotalGoodsInStock() {
        return totalGoodsInStock;
    }

    public Warehouse( int totalGoodsInStock){
        this.totalGoodsInStock = totalGoodsInStock;
    }
//   Method that prompts the user for how many goods they would like to add to the warehouse
//and then increments the total number of goods by that amount
    public void addGoods() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many would you like to add?");
        int addAmount = scan.nextInt();
        this.totalGoodsInStock += addAmount;
    }
//    A method that prompts the user for how many goods they would like to remove from the
//warehouse and then decrements the total number of goods by that amount
    public void removeGoods() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many would you like to remove?");
        int removeAmount = scan.nextInt();
//      If `removeAmount` is larger than the amount of goods in stock.
//      Keep asking user for a number that is smaller
        while (removeAmount > this.totalGoodsInStock) {
            System.out.println("Not enough goods in stock. Choose less goods: ");
            removeAmount = scan.nextInt();
        }
        this.totalGoodsInStock -= removeAmount;
    }
}
