package Lab2.Lab2P2;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Student ID : ");

        String ID = input.nextLine() ;

        System.out.print("Enter Student Name : ");

        String name = input.nextLine() ;
        

        StudentLab2 S1 = new StudentLab2(ID, name) ;


        S1.displayInfo();

        input.close();
    }
}
