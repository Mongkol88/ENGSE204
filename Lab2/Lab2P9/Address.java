package Lab2.Lab2P9 ;

public class Address {
    private String street ;
    private String City ;
    private String zipCode ;

    public Address(String street, String City, String zipCode) {
        this.street = street ;
        this.City = City ;
        this.zipCode = zipCode ;
    }
    
    public String getFullAddress() {
        return this.street + ", " + this.City + ", " + this.zipCode ;
    }
    

}