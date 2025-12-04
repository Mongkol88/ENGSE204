package Lab3.Lab3P8;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        String productname = input.nextLine() ;

        int initstock = input.nextInt() ;

        Inventoryitem inventory1 = new Inventoryitem(productname, initstock) ;

        int n = input.nextInt() ;

        for (int i = 0; i < n; i++) {
            String order = input.next() ;

            if ( order.equals("ADD") ) {

                int newstock = input.nextInt() ;
                inventory1.addStock(newstock) ; 

            } else if ( order.equals("SELL") ) {

                int sell = input.nextInt() ;
                inventory1.sellStock(sell) ;
                
            }
        }

        System.out.println("Final Stock: "+inventory1.getStock());


        input.close();
    }
}
