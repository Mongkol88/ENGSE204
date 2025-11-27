package Lab2.Lab2P10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int n = input.nextInt() ;

        ShoppingCart shoppingcart = new ShoppingCart() ;

        for (int i = 0; i < n; i++) {

            String name = input.next() ;

            double price = input.nextDouble() ;

            Product product = new Product(name, price) ;

            shoppingcart.addProduct(product) ;

        }

        System.out.print(shoppingcart.calculate());

        input.close();
    }
}
