package Lab1.Lab1P2 ;

import java.util.Scanner ;

public class lab1P2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println( "Enter Width : " ) ; 

        double W = input.nextDouble() ;

        System.out.println( "Enter Height : " ) ; 

        double H = input.nextDouble() ; 

        double ResultArea = H * W ;

        System.out.println( "Result :" ) ; 

        System.out.println( ResultArea ) ;

        input.close();
    }
}
