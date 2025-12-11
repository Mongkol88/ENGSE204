package Lab4.Lab4P2;

import java.util.Scanner ;

class Product {
    private String name ;
    private double price ;

    public Product(String name) {
        this(name, 0.0) ;
    }

    public Product(String name, double price) {
        this.name = name ;
        this.price = price ;
    }
    public void displayinfo() {
        System.out.println("Product : " + this.name + ", " + "Price : " + this.price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int mode = sc.nextInt() ;

        sc.nextLine() ;

        if (mode == 1) {
            String naem = sc.nextLine() ;
            Product product = new Product(naem) ;
            product.displayinfo();
        } else if ( mode == 2) {
            String name = sc.nextLine() ;
            double price = sc.nextDouble() ;
            Product product = new Product(name, price) ;
            product.displayinfo();
        }


        sc.close();
    }
}

