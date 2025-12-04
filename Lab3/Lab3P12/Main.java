package Lab3.Lab3P12;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        String name = sc.nextLine() ;

        double monthlysalary = sc.nextDouble() ;

        double taxrate = sc.nextDouble() ;

        double raiseamount = sc.nextDouble() ;

        Employee employee1 = new Employee(name, monthlysalary) ;

        System.out.println("Tax (Before): " + employee1.calculateTax(taxrate)) ;

        employee1.giveRaise(raiseamount) ;

        System.out.println("Tax (After): " + employee1.calculateTax(taxrate)) ;


        sc.close();
    }
}
