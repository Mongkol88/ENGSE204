package Lab2.Lab2P12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        String courseid = input.nextLine() ;

        String coursename = input.nextLine() ;

        String studentname = input.nextLine() ; 


        Course course = new Course(courseid, coursename) ;

        Student student = new Student(studentname, course) ;

        student.displayEnrollment();


        input.close();
    }
}
