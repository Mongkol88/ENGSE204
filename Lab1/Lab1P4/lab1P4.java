package Lab1.Lab1P4;

import java.util.Scanner;

public class lab1P4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println( "Enter Score : " ) ;

        int score = input.nextInt() ;
    
        if ( score >= 80 && score <= 100 ) {

            System.out.println( "Grade : A" ) ;

        } else if ( score >= 70 && score <= 79 ) {
            
            System.out.println( "Grade : B" ) ;
            
        } else if ( score >= 60 && score <= 69 ) {
            
            System.out.println( "Grade : C" ) ;
            
        } else if ( score >= 50 && score <= 59 ) {
            
            System.out.println( "Grade : D" ) ;
            
        } else if ( score >= 0 && score <= 49 ) {
            
            System.out.println( "Grade : F" ) ;
            
        } else {
            System.out.println( "Please Enter Number between 1-100" ) ;
        }

        input.close();
    }

}
