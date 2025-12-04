package Lab3.Lab3P7;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        String employeeid = input.nextLine() ;

        String department = input.nextLine() ;

        String newdepartment = input.nextLine() ;

        Employee employee1 = new Employee(employeeid, department) ;

        employee1.setDepartment(newdepartment) ;

        System.out.println( employee1.getEmployee() );

        System.out.println( employee1.getDepartment() );


        input.close();
    }
}
