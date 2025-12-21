package Lab5.Lab5P7;
import java.util.*;

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String n, double s) {
        name = n;
        baseSalary = s;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    protected double commRate;

    public SalesEmployee(String name, double salary, double rate) {
        super(name, salary);
        this.commRate = rate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commRate);
    }
}

class Manager extends Employee {
    protected double bonus;

    public Manager(String name, double sal, double b) {
        super(name, sal);
        this.bonus = b;
    }
    @Override
    public double calculatePay() {
        return baseSalary + bonus;
    }
}

class PayrollProcessor {
    public static void process(Employee emp) {
        System.out.println(emp.name + " Total Pay: " + emp.calculatePay());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String n1 = input.nextLine();
        double s1 = input.nextDouble();
        double r1 = input.nextDouble();
        input.nextLine();

        String n2 = input.nextLine();
        double s2 = input.nextDouble();
        double b2 = input.nextDouble();

        SalesEmployee se = new SalesEmployee(n1, s1, r1);
        Manager mg = new Manager(n2, s2, b2);

        PayrollProcessor.process(se);
        PayrollProcessor.process(mg);
        
        input.close();
    }
}