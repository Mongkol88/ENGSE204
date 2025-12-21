package Lab6.Lab6P2;

import java.util.Scanner;

interface IDisplayable {
    public void display();
    public String getDetail();
}

class Student implements IDisplayable {
    protected String name;
    protected String studentid;
    public Student(String name, String studentid) {
        this.name = name;
        this.studentid = studentid;
    }
    @Override
    public void display() {
        System.out.println("---Student Profile---");
    }
    @Override
    public String getDetail() {
        return "Name: " + this.name + ", ID: " + this.studentid;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String studentid = sc.nextLine();
        Student student = new Student(name, studentid);
        student.display();
        System.out.println(student.getDetail());

        sc.close();
    }
}
