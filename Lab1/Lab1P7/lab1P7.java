package Lab1.Lab1P7;

import java.util.Scanner ;

public class lab1P7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ; 

        System.out.println("Enter N :");

        int n = input.nextInt() ; 

        int totalsum = 0 ;


        for (int i = 0; i < n; i++) {

            System.out.println("Enter Number of " + i + " : ");

            totalsum += input.nextInt() ;

        }

        System.out.println( "Result : " + totalsum );

        input.close();
    }
}
