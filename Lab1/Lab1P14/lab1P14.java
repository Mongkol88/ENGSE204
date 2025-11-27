package Lab1.Lab1P14;

import java.util.Scanner;

public class lab1P14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Number of Row : ") ;

        int R = input.nextInt() ;

        System.out.print("Enter Number of Colunm : ");

        int C = input.nextInt() ;

        char[][] Matrix = new char[R][C] ;


        for (int i = 0; i < Matrix.length; i++) {

            for (int j = 0; j < Matrix[i].length ; j++) {

                char object = input.next().charAt(0) ;

                Matrix[i][j] = object ;

            }
        }

        System.out.print("Enter Row of Target : ");

        int R_target = input.nextInt() ;

        System.out.print("Enter Colunm of Target : ");

        int C_target = input.nextInt() ;

        boolean isFound = false ;


        for (int i = 0; i < Matrix.length; i++) {

            for (int j = 0; j < Matrix[i].length ; j++) {

                if (R_target == i && C_target == j && Matrix[i][j] == '*') {

                    isFound = true ;

                    System.out.println("Mine!");

                }
            }
        }

        int total_Bomb = 0;

        if (!isFound) {

            if ( R_target >= 1 && C_target >= 1 ) {

                for (int i = R_target - 1; i < R; i++) {

                    for (int j = C_target - 1; j < C; j++) {

                        if (Matrix[i][j] == '*') {

                            total_Bomb++;

                        } 
                    }
                }
            } else if ( R_target == 0 && C_target >= 1 ) {

                


                for (int i = R_target; i < R; i++) {

                    for (int j = C_target - 1; j < C; j++) {

                        if (Matrix[i][j] == '*') {


                            total_Bomb++;

                        }
                    }
                }
            } else if ( C_target == 0 && R_target >= 1 ) {
                for (int i = R_target - 1; i < R; i++) {

                    for (int j = C_target; j < C; j++) {

                        if (Matrix[i][j] == '*') {


                            total_Bomb++;

                        }
                    }
                }
            } else if (C_target == 0 && R_target == 0) {

                for (int i = R_target; i < R; i++) {

                    for (int j = C_target; j < C; j++) {

                        if (Matrix[i][j] == '*') {

                            total_Bomb++;

                        }
                    }
                }
            }

            System.out.println("Result : " + total_Bomb);
        }

        input.close();

    }
}