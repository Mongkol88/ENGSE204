package Lab2.Lab2P10;

public class ShoppingCart {
    private Product[] items = new Product[10] ;
    private int itemCount = 0 ;

    public void addProduct(Product P) {
        this.items[this.itemCount] = P ;
        this.itemCount++;
    }

    public double calculate() {
        double totalPrice = 0;
        for (int i = 0; i < this.itemCount; i++) {
            totalPrice += this.items[i].getprice() ;
        }
        return totalPrice ;
    }
}
