package Lab1.Lab1P9;


import java.util.Scanner;

public class lab1P9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ; 

        int total = 0 ;

        System.out.println("Enter N :");

        int n = input.nextInt() ;

        int[] num = new int[n] ;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter Number :");

            int x = input.nextInt() ;

            total += x ;
        }

        double average = (double) total / num.length;


        System.out.println("Average : " + average);

        input.close();
    }
}
