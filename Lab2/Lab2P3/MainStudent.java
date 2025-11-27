package Lab2.Lab2P3;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int n = input.nextInt() ;


        for (int i = 0; i < n; i++) {

            System.out.print("Enter Student ID : ");

            String ID = input.next() ;

            System.out.print("Enter Student Name : ");

            String name = input.next() ;

            StudentLab3 S1 = new StudentLab3(ID, name) ;



        }

        System.out.println(StudentLab3.studentCount);

        input.close();
    }
}
