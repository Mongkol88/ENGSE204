package Lab2.Lab2P6;

public class BankAccount {
    private String OwnerName ;
    private double Balance ;

    public BankAccount(String OwnerName, double Balance) {
        this.OwnerName = OwnerName ;
        this.Balance = Balance ;


    }

    public void deposit(double amount) { this.Balance += amount ; }

    public void displaySummary() {
        System.out.println("Owner : " + this.OwnerName);
        System.out.println("Balance : " + this.Balance);
    }
}
