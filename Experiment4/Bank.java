class Customer {
    private double balance; 
    
    public Customer() {
        this.balance = 0.0;
    }

   
    public void addBalance(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void addBalance(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

  
    protected void deductBalance(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("Deducted: $" + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

  
    void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class Bank {
    public static void main(String a[]) {
        Customer customer = new Customer();

      
    
      
   
        customer.showBalance();
    }
}
