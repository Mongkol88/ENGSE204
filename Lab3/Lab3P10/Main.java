package Lab3.Lab3P10;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int n = input.nextInt() ;

        for (int i = 0; i < n; i++) {
            String mode = input.next() ;
            if ( mode.equals("SET") ) {
                int newset = input.nextInt() ;
                SystemLogger.setLogLevel(newset) ;
            } else if ( mode.equals("LOG") ) {
                int newlog = input.nextInt() ;
                input.nextLine() ;
                String massagelog = input.nextLine() ;
                SystemLogger.log(newlog, massagelog) ;
            }
        }
        input.close();
    }
}
