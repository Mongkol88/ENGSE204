package Lab6.Lab6P1;

import java.util.Scanner;

abstract class Employee {
    protected String name ;
    public Employee(String name) {
        this.name = name;
    }
    public void displayinfo() {
        System.out.println("Employee Name: " + this.name);
    }
    public abstract double calulatepay();
}

class salaryemployee extends Employee {
    protected double monthlysalary;

    public salaryemployee(String name, double monthlysalary) {
        super(name);
        this.monthlysalary = monthlysalary;
    }
    @Override
    public double calulatepay() {
        return this.monthlysalary;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        salaryemployee salaryemployee = new salaryemployee(name, salary);
        salaryemployee.displayinfo();
        System.out.println(salaryemployee.calulatepay());

        sc.close();
    }
}
