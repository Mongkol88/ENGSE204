package Lab2.Lab2P8 ;

import java.util.Scanner ;

public class TempConverter {

    public static double celsiusToFahrenheit(double celsius) { return (celsius * 9.0/5.0) + 32 ; }

    public static double fahrenheitToCelius(double fahrenheit) { return (fahrenheit - 32) * 5.0/9.0 ; }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        String mode = input.next();

        double temperature = input.nextDouble() ;

        
        if ( mode.equals("C_TO_F") ) { System.out.print(celsiusToFahrenheit(temperature)) ; }
        else if ( mode.equals("F_TO_C") ) { System.out.print(fahrenheitToCelius(temperature)) ; }

        input.close();
    }

     
}