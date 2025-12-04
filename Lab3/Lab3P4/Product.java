package Lab3.Lab3P4;

public class Product {
    private String name ;
    private static int productCount ;

    public Product(String name) {
        this.name = name ;

        productCount++;
    }

    public String getName() { return this.name ; }

    public static int getProductCount() { return productCount ; }
}
