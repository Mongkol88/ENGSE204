package Lab1.Lab1P12;

import java.util.Scanner;

public class lab1P12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        
        System.out.println("Enter Number : ");

        int n = input.nextInt() ;

        int[] ID = new int[n] ;

        int[] Quantity = new int[n] ;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Product ID : ");

            int x = input.nextInt() ;

            ID[i] = x ;

            System.out.println("Enter Stock Quantity : ");

            int y = input.nextInt() ;

            Quantity[i] = y ;
        }

        System.out.println("Enter Product ID to Search : ");
        
        int Search_ID = input.nextInt() ;

        boolean isFound = false ;

        for (int i = 0; i < n; i++) {
            if ( ID[i] == Search_ID ) {

                isFound = true ;

                System.out.println("Product " + Search_ID + " Has found " + Quantity[i]);
                
                break;
            }
        }

        if ( isFound == false ) {

            System.out.println("Product " + Search_ID + " not found");

        }


        input.close();
    }
}
