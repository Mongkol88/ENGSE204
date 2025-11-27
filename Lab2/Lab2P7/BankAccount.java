package Lab2.Lab2P7;

public class BankAccount {
    private String OwnerName ;
    private double Balance ;

    public BankAccount(String OwnerName, double Balance) {
        this.OwnerName = OwnerName ;
        this.Balance = Balance ;


    }

    public void deposit(double amount) { this.Balance += amount ; }

    public void displaySummary() {
        System.out.println("Balance : " + this.Balance);
    }

    public void withdraw(double amount) {
        if ( amount <= this.Balance ) { 
            this.Balance -= amount ; System.out.println("Withdrawal Successful"); 
        } else if ( amount >= this.Balance ) { 
            System.out.println("Insufficient funds");
        }
    }
}
