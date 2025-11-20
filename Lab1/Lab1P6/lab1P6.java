package Lab1.Lab1P6;

import java.util.Scanner;

public class lab1P6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println( "Enter Number : ");

        int x = input.nextInt() ;

        for (int i = 1; i <= 12; i++) {

            int result = x * i ;

            System.out.println( x + " x " + i + " = " + result );
            
        }

        input.close();
    }
}
