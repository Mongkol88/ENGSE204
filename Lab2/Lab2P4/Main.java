package Lab2.Lab2P4 ;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Name : " ) ;

        String name = input.nextLine() ;

        System.out.print("Enter Score Mid Term : ") ;

        int mid = input.nextInt() ;

        System.out.print("Enter Score Final : ") ;

        int Final = input.nextInt() ;

        Student S1 = new Student(name , mid, Final) ;

        S1.displaySummary() ;
        


        input.close() ;
    }
    
}