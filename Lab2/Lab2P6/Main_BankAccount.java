package Lab2.Lab2P6;

import java.util.Scanner;

public class Main_BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        String name = input.nextLine() ;

        double initialbalance = input.nextDouble() ;

        double deposit = input.nextDouble() ;

        BankAccount BankAccount1 = new BankAccount(name, initialbalance) ;

        BankAccount1.deposit(deposit);

        BankAccount1.displaySummary();


        input.close();
    }
}

