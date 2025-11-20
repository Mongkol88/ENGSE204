package Lab1.Lab1P11;

import java.util.Scanner;

public class lab1P11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter index of array : ") ;

        int n = input.nextInt() ;

        int[] numbers = new int[n] ;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter Number : ") ;

            int x = input.nextInt() ;

            numbers[i] = x ;
        }

        int calculator = sumArray(numbers) ;

        System.out.println("Result of SumArray : " + calculator) ;

        input.close();
    }

    public static int sumArray(int[] numbers) {
        int total = 0 ;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i] ;
        }
        return total ;
    }
}
