package Lab3.Laba3P15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        
        String username = sc.next() ;

        User user1 = new User(username) ;

        int n = sc.nextInt() ;

        for (int i = 0; i < n; i++) {
            String mode = sc.next() ;

            if ( mode.equals("SET_POLICY") ) {
                int newpolicy = sc.nextInt() ;

                user1.setPolicy(newpolicy) ;
                
            } else if ( mode.equals("LOGIN") ) {
                String password = sc.next() ;

                user1.login(password) ;

            }
        }


        sc.close();
    }
}
