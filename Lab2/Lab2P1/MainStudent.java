package Lab2.Lab2P1;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Student ID : ") ;

        String ID = input.nextLine() ;

        System.out.print("Enter Student Name : ") ;

        String name = input.nextLine() ;
        

        Student S1 = new Student(ID, name) ;
        
        

        System.out.println("ID : " + S1.GetID()) ;
        System.out.println("Name : " + S1.GetName()) ;

        input.close();
    }
}
