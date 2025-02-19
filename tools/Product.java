package tools;
/*4) In an Online Shopping System, different methods for handling product inventory and discounts need to be securely managed. Create a package ECommerce containing a class Product with a public method getProductDetails() to retrieve product information, a protected method applyDiscount() for internal discount management, a default-access method updateStock() for inventory updates within the same package, and a private method calculateProfit() that computes earnings internally. Then, create another package CustomerPortal with a class CustomerCart that attempts to access these methods from an instance of Product. Demonstrate which methods are accessible and explain how Java’s access control mechanism ensures that only the appropriate users can access sensitive product operations.
 * 
 */



public class Product {
    private String name ;
    private double price;
    private int stock;
    public Product(String name,double price,int stock){
        this.name=name;
        this.price=price;
        this.stock=stock;
    }
    public void getProductDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price:" + price);
        System.out.println("Stock: " + stock);
    }
    protected void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
        System.out.println("Discount applied! New Price: $" + price);
    }
    void updateStock(int newStock) {
        this.stock = newStock;
        System.out.println("Stock updated: " + stock);
    }
    private void calculateProfit() {
        double profit = price * 0.35;
        System.out.println("Profit: $" + profit);
    }
    
}
