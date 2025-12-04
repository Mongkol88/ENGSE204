package Lab2.Lab2P7;

import java.util.Scanner;

public class Main_BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        String name = input.nextLine() ;

        double initialbalance = input.nextDouble() ;

        double withdraw1 = input.nextDouble() ;

        double withdraw2 = input.nextDouble() ;

        
        BankAccount BankAccount1 = new BankAccount(name, initialbalance) ;

        BankAccount1.withdraw(withdraw1) ;

        BankAccount1.withdraw(withdraw2) ;

        BankAccount1.displaySummary() ;


        input.close() ;
    }
}

