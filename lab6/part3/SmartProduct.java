public class SmartProduct {
    /*
    *   o A String variable to store the product’s name
        o An integer variable to store the number of units of product the user wishes to order
        o A double variable to store the price of a single unit of the product
        o A double variable to store the total cost of the ordered products
        o Appropriate getter and setter methods for each variable
        o Also make sure that each variable is mark
    * */
    private int productID;
    private String name;
    private int unitsOrdered;
    private double price;
    private double totalPrice;

    public SmartProduct() {
        this.name = "";
        this.unitsOrdered = 0;
        this.price = 0;
        this.totalPrice = 0;
    }

    public SmartProduct(int productID, String name, int units, double price) {
        this.name = name;
        this.unitsOrdered = units;
        this.price = price;
        this.totalPrice = (this.price * this.unitsOrdered);
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public int getunitsOrdered() {
        return unitsOrdered;
    }

    public void setunitsOrdered(int unitsOrdered) {
        this.unitsOrdered = unitsOrdered;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setName(String name) {
        this.name = name;
    }
}
