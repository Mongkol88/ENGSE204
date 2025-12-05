package Lab3.Lab3P6;

public class BankAccount {
    private double balance ;

    public BankAccount(double initialBalance) {
        
        if ( initialBalance >= 0 ) { this.balance = initialBalance ; }
        else { this.balance = 0 ; }

    }

    public double getBalance() { return this.balance ; }

    public void deposit(double amount) {

        if ( amount >= 0 ) {

            this.balance += amount ;
            System.out.println("Deposit successful.") ;

        } else { System.out.println("Invalid deposit amount.") ; }
    }

    public void withdraw(double amount ) {

        if ( amount >= 0 && amount <= this.balance ) {

            this.balance -= amount ;
            System.out.println("Withdrawal successful.") ;
            
        } else if ( amount >= 0 && amount >= this.balance ) { 

            System.out.println("Insufficient funds.") ; 

        }
        else { System.out.println("Invalid withdrawal amount.") ; }

    }
}
