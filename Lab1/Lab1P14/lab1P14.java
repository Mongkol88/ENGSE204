package Lab1.Lab1P14;

import java.util.Scanner;

public class lab1P14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter Number of Row : ") ;

        int R = input.nextInt() ;

        System.out.println("Enter Number of Colunm : ");

        int C = input.nextInt() ;

        char[][] Matrix = new char[R][C] ;

        

        for (int i = 0; i < Matrix.length; i++) {

            for (int j = 0; j < Matrix[i].length ; j++) {

                System.out.println("Enter Star or Bomb :");

                char object = input.next().charAt(0) ;

                Matrix[i][j] = object ;

            }
        }

        System.out.println("Enter Row of Target : ");

        int R_target = input.nextInt() ;

        System.out.println("Enter Colunm of Target : ");

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

                for (int i = R_target - 1; i < 3; i++) {

                    for (int j = C_target - 1; j < 3; j++) {

                        if (Matrix[i][j] == '*') {

                            System.out.println("Debug " + i + " " + j);

                            total_Bomb++;

                        } 
                    }
                }
            } else if ( R_target == 0 && C_target >= 1 ) {

                for (int i = R_target; i < 3; i++) {

                    for (int j = C_target - 1; j < 3; j++) {

                        if (Matrix[i][j] == '*') {

                            System.out.println("Debug " + i + " " + j);

                            total_Bomb++;

                        }
                    }
                }
            } else if ( C_target == 0 && R_target >= 1 ) {
                for (int i = R_target - 1; i < 3; i++) {

                    for (int j = C_target; j < 3; j++) {

                        if (Matrix[i][j] == '*') {

                            System.out.println("Debug " + i + " " + j);

                            total_Bomb++;

                        }
                    }
                }
            } else if (C_target == 0 && R_target == 0) {

                for (int i = R_target; i < 3; i++) {

                    for (int j = C_target; j < 3; j++) {

                        if (Matrix[i][j] == '*') {

                            System.out.println("Debug " + i + " " + j);

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