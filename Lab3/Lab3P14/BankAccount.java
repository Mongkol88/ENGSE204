package Lab3.Lab3P14;

public class BankAccount {
    private double balance ;
    private static int totalTransactionCount = 0;

    public BankAccount(double initialDeposit) {
        if ( initialDeposit >= 0 ) {
            this.balance = initialDeposit ;
        } else { this.balance = 0 ; }
        System.out.println("Account created.");
    }

    public void deposit(double amount) {
        if ( amount > 0 ) {
            this.balance += amount ;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else { System.out.println("Invalid amount."); }
    }

    public void withdraw(double amount) {
        if ( amount > 0 && amount <= this.balance ) {
            this.balance -= amount ;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        } else if ( amount > this.balance ) {
            System.out.println("Insufficient funds.");
        } else { System.out.println("Invalid amount."); }
    }

    public double getBalance() { return this.balance ; }

    public static int getTotalTransactionCount() { return totalTransactionCount ; }


}
