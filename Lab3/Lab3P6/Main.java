package Lab3.Lab3P6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        double initbalance = input.nextDouble() ;

        double depositamount = input.nextDouble() ;

        double withdrawalamount = input.nextDouble() ;

        BankAccount bankaccount1 = new BankAccount(initbalance) ;

        bankaccount1.deposit(depositamount) ;

        bankaccount1.withdraw(withdrawalamount) ;

        System.out.println(bankaccount1.getBalance()) ;

        input.close();
    }
}
