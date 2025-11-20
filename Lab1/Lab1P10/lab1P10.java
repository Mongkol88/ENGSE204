package Lab1.Lab1P10;

import java.util.Scanner;;

public class lab1P10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ; 

        System.out.println("Enter width :") ;

        double w = input.nextDouble() ;

        System.out.println("Enter height :") ;

        double h = input.nextDouble() ;

        double result  = calculateArea(w, h) ;


        System.out.println("Result : " + result) ;

        input.close();
    }

    public static double calculateArea( double width, double height ) {
        return width * height  ;
    }
}
