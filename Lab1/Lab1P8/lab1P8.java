package Lab1.Lab1P8;

import java.util.Scanner;;

public class lab1P8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ; 

        int HighestNumber = -99999999 ;

        System.out.println("Enter N :");

        int n = input.nextInt() ;

        int[] num = new int[n] ;

        for (int i = 0; i < num.length; i++) {
            
            System.out.println("Enter :");

            int x = input.nextInt();

            num[i] = x ;

            
            if (num[i] > HighestNumber) {

                HighestNumber = num[i];

            }
            
        }

        System.out.println( "Highest Number : " + HighestNumber);

        input.close();
    }
}
