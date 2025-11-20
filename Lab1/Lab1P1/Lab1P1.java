package Lab1.Lab1P1 ; 

import java.util.Scanner ;

public class Lab1P1 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int x = input.nextInt() ;

    int y = input.nextInt() ;

    int result = x + y ;
    
    System.out.println( result );

    input.close();
    }
}