package Lab1.Lab1P5;

import java.util.Scanner ;

public class lab1P5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("------Menu------\n" + 
                        "1 = \"Americano\"\r\n" + 
                        "2 = \"Latte\"\r\n" + 
                        "3 = \"Espresso\"\r\n" +
                        "4 = \"Mocha\""
                    );
        System.out.println("Enter order");

        int order = input.nextInt() ;

        switch ( order ) {
            case 1:

                System.out.println("Americano");

                break;
            case 2:

                System.out.println("Latte");

                break;
            case 3:

                System.out.println("Espresso");

                break;
            case 4:

                System.out.println("Mocha");

                break;
            default:

                System.out.println("Invalid Menu");

                break;
        }

        input.close();
    }
}
