package Lab3.Lab3P14;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        BankAccount myAccount = null ;

        int n = sc.nextInt() ;

        for (int i = 0; i < n; i++) {
            String mode = sc.next() ;

            if ( mode.equals("CREATE") ) {
                double initialbalance = sc.nextDouble() ;

                myAccount = new BankAccount(initialbalance) ;
            } else if ( mode.equals("DEPOSIT") ) {
                if ( myAccount != null ) {
                    double amount = sc.nextDouble() ;

                    myAccount.deposit(amount);
                } else { System.out.println("No Account exists."); }
                
            } else if ( mode.equals("WITHDRAW") ) {
                if ( myAccount != null ) {
                    double amount = sc.nextDouble() ;

                    myAccount.withdraw(amount);
                } else { System.out.println("No Account exists."); }
                
            } else if ( mode.equals("STATUS") ) {
                if ( myAccount != null ) {
                    System.out.println("Balance: " + myAccount.getBalance());
                } else { System.out.println("No Account exists."); }
                
            } else if ( mode.equals("GLOBAL_STATUS") ) {
                System.out.println("Total Transaction: " + BankAccount.getTotalTransactionCount());
            }

        }

        sc.close();
    }
}
