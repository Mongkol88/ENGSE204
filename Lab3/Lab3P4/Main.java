package Lab3.Lab3P4;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int n = input.nextInt() ;

        for (int i = 0; i < n; i++) {
            
            String productname = input.next() ;

            Product product = new Product(productname) ;

        }

        System.out.println(Product.getProductCount()) ;

        input.close() ; 
    }
}
