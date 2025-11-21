package Lab1.Lab1P13 ;

import java.util.Scanner;

public class lab1P13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int totalServers_Online = 0;

        System.out.println("Enter Number of Row : ") ;

        int R = input.nextInt() ;

        System.out.println("Enter Number of Colunm : ");

        int C = input.nextInt() ;


        int[][] Matrix = new int[R][C] ;


        for (int i = 0; i < Matrix.length; i++) {

            for (int j = 0; j < Matrix[i].length ; j++) {

                System.out.println("Enter :");

                int x = input.nextInt() ;

                Matrix[i][j] = x ;

                if ( x == 1 ) {
                    totalServers_Online++;
                }
            }
        }


        System.out.println("Total Server Online : " + totalServers_Online);

        input.close();
    }
}
