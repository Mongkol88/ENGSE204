package Lab4.Lab4P9;

import java.util.Scanner;

class ImmutableAccount {
    private String accountid;
    private double balance;

    public ImmutableAccount(String accountid, double balance) {
        this.accountid = accountid;
        if (balance < 0) {
            this.balance = 0 ;
        } else { this.balance = balance; }
    }
    public ImmutableAccount(ImmutableAccount other) {
        this(other.accountid, other.balance);
    }

    public String getAccountid() { return this.accountid; }
    public double getBalance() { return this.balance; }

    public void displayinfo() {
        System.out.println("ID: " + this.accountid + ", Balance: " + this.balance);
    }

    public ImmutableAccount deposit(double amount) {
        if (amount > 0) {
            return new ImmutableAccount(accountid, this.balance + amount);
        } else{
            System.out.println("Invalid deposit amount.");
            return this;
        }
    }

    public ImmutableAccount withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            return new ImmutableAccount(accountid, this.balance -= amount);
        } else if ( amount > balance ) {
            System.out.println("Insufficint funds");
            return this;
        } else { 
            System.out.println("Invalid withdrawal amount.");
            return this;
         }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        double initmoney = sc.nextDouble();
        double deposit = sc.nextDouble();
        double withdrawal = sc.nextDouble();

        ImmutableAccount acc1 = new ImmutableAccount(id, initmoney);
        ImmutableAccount acc2 = acc1.deposit(deposit);
        ImmutableAccount acc3 = acc2.withdraw(withdrawal);
        acc1.displayinfo();
        acc3.displayinfo();

        sc.close();
    }
}
