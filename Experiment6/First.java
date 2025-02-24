/*1) In a taxation system, businesses need to calculate the tax applied to their invoices while 
ensuring the tax rate remains unchanged. Create a class TaxCalculator that defines a final variable
 GST_RATE, set to 18.0%, which cannot be modified. Additionally, define a final method displayGST() 
 that prints the tax rate. Create another class Invoice that extends TaxCalculator and includes a 
 method calculateTotalWithTax(double amount), which computes the total amount after applying 
 GST_RATE. In the main() method, test the calculateTotalWithTax() method and observe what happens 
 if you attempt to modify GST_RATE or override displayGST(). This exercise will highlight how the
  final keyword ensures that tax rates remain constant across all calculations. */
class Taxation{
    final double GST_RATE=18.0;
    final void displayGST(){
        System.out.println("The tax rate is:"+GST_RATE);
    }

}
class Invoice extends Taxation{
    double calculateTotalWithTax(double amount){
        return amount+(amount*GST_RATE)/100;
    }
}
public class First {
    public static void main(String a[]){
        
    }
}
