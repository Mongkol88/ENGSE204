package Lab1.Lab1P3;

import java.util.Scanner;;

public class lab1P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter Number : ") ;

        int X = input.nextInt() ;
        
        
        if ( X % 2 == 0 ) {

            System.out.println("Result : Even") ;
            
        } if ( X % 2 == 1 ) {
            System.out.println("Result : Odd") ;
        }

        input.close();
    }
}
