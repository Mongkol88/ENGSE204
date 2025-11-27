package Lab2.Lab2P9;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        String name = input.nextLine() ;

        String street = input.nextLine() ;

        String City = input.nextLine() ;

        String zipcode = input.nextLine() ;

        Address address = new Address(street, City, zipcode) ;

        Student student = new Student(name, address) ;


        student.displayProfile(); 

        
        input.close();
    }
}
