package Lab5.Lab5P8;

import java.util.Scanner;

class Person {
    protected String name;
    public Person(String name) {
        this.name = name;
    }
    public String getStatus() {
        return "Person: " + this.name;
    }
}

class Student extends Person {
    protected int StudentId;
    public Student(String name, int StudentId) {
        super(name);
        this.StudentId = StudentId;
    }
    @Override
    public String getStatus() {
        return "Student: " + name + ", ID: " + this.StudentId;
    }
}

class Employee extends Person {
    protected double salary;
    public Employee(String nmae, double salary) {
        super(nmae);
        this.salary = salary;
    }
    public void applyBonus(double bonus) {
        this.salary += bonus;
    }
    @Override
    public String getStatus() {
        return "Employee: " + name + ", Salary: " + this.salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String StudentName = sc.nextLine();
        int StudentID = sc.nextInt();
        sc.nextLine();
        String EmployeeName = sc.nextLine();
        double EmployeeSalary = sc.nextDouble();

        Student student = new Student(StudentName, StudentID);
        Employee employee = new Employee(EmployeeName, EmployeeSalary);
        Person[] persons = {student, employee};
        for (Person person : persons) {
            if (person instanceof Employee) {
                Employee employee1 = (Employee) person;
                employee1.applyBonus(1000.0);
            }
        }
        for (Person person : persons) {
            System.out.println(person.getStatus());
        }
        sc.close();
    }
}
