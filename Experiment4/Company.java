/*5.  A company wants to manage a list of products with details such as product ID, name, price, and category. They also want to keep track of the total number of products and calculate the overall stock value.
Product Class:
Instance variables: productId, productName, category.
A private variable price.
A default constructor setting some default values.
A parameterized constructor that initializes product details using this to differentiate parameters from class fields.
A public method getPrice() to access the private price.
A public method displayProductInfo() to show all details.
Static Members:
A static variable totalProducts to count how many Product objects are created.
A static method displayTotalProducts() to print the total count.
Method to Calculate Stock Value:
A method (e.g., calculateStockValue()) to multiply the price by a given quantity (demonstrate method overloading by adding an optional parameter for a discount rate).
In the main method:
Create multiple Product objects using both the default and parameterized constructors.
Call the static method to display the total number of products.
Display each product’s details, including the price and the calculated stock value for a given quantity.
 * 
 */
class Product{
String product_id,productName,category;
private int price;
static int totalProducts = 0;
 Product(){
    product_id="Defualt";
    productName="Defualt";
    category="Default";
    price=0;
    totalProducts++;

}
Product(String product_id,String productName,String category,int price){
    this.category=category;
    this.price=price;
    this.productName=productName;
    this.product_id=product_id;
}
public void getPrice(){
    System.out.println(this.price);

}
public void displayProductInfo(){
    System.out.println("The productID is:"+product_id+"\nThe product name is:"+ productName+" \nThe category is:"+ category+"\nThe price is:"+price);
}
public static void displayTotalProducts() {
    System.out.println("Total number of products: " + totalProducts);
}
    public double calculateStockValue(int quantity) {
        return price * quantity;
    }

public double calculateStockValue(int quantity, double discountRate) {
    double totalValue = price * quantity;
    double discountAmount = totalValue * (discountRate / 100);
    return totalValue - discountAmount;
}

}



    

public class Company {
    public static  void main(String a[]){
        Product p1 = new Product();
        Product p2 = new Product("1234", "Laptop", "Pc/Laptop", 1500);
        p1.displayProductInfo();
        System.out.println("p2.name");

    }
    
}
