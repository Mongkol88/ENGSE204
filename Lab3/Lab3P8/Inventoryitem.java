package Lab3.Lab3P8;

public class Inventoryitem {
    private String productName ;
    private int Stock ;


    public Inventoryitem(String productname , int Stock) {
        this.productName = productname ;

        if ( Stock >= 0 ) { this.Stock = Stock ; }
        else { this.Stock = 0 ; }
    }

    public String getProductName() { return this.productName ; }

    public int getStock() { return this.Stock ; }

    public void addStock(int amount) { 
        if (amount >= 0 ) { 
            this.Stock += amount ;
            System.out.println("Stock Added.") ;
        } else { System.out.println("Invalid amount.") ; }
    }

    public void sellStock(int amount) {
        if ( amount >= 0 && amount <= this.Stock ) {
            this.Stock -= amount ;
            System.out.println("Sale successful.") ;
        } else if ( amount > this.Stock ) {
            System.out.println("Not enough stock.") ;
        } else { System.out.println("Invalid amount.") ; }
    }
}
