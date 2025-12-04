package Lab3.Lab3P11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt() ;

        for (int i = 0; i < n ; i++) {
            String mode = sc.next() ;

            if ( mode.equals("SET_URL") ) {
                String newUrl = sc.next() ;

                SystemConfig config = SystemConfig.getinstance() ;

                config.setServerUrl(newUrl);

            } else if ( mode.equals("SET_MAX") ) {
                int Max_count = sc.nextInt() ;

                SystemConfig config = SystemConfig.getinstance() ;

                config.SetMaxConnections(Max_count) ;
                
            } else if ( mode.equals("SHOW") ) {
                SystemConfig config = SystemConfig.getinstance() ;

                System.out.println("URL: " + config.getServerUrl());
                System.out.println("MAX: " + config.getMaxConnections());
            } 
        }


        sc.close();
    }
}
