package Lab3.Lab3P13;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt() ;

        for (int i = 0; i < n; i++) {
            String mode = sc.next() ;

            if ( mode.equals("SET") ) {
                int newmax = sc.nextInt() ;

                LicenseManager.SetMax(newmax) ;
                
            } else if ( mode.equals("CHECKOUT") ) {
                LicenseManager.checkout() ;
                
            } else if ( mode.equals("CHECKIN") ) {
                LicenseManager.checkIn() ; 
                
            } else if ( mode.equals("STATUS") ) {
                LicenseManager.displaystatus() ;
                
            }
        }

        sc.close();
    }
}
