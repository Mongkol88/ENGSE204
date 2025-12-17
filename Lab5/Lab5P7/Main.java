package Lab5.Lab5P7;

import java.util.Scanner;

class Employee {
    protected String name;
    protected double baseSalary;
    public Employee(String name, double basesalary) {
        this.name = name;
        this.baseSalary = basesalary;
    }
    public double calculatePay() {
        return this.baseSalary;
    }
}

class SalesEmployee extends Employee {
    protected double commissionRate = 0.10;
    public SalesEmployee(String name, double basesalary, double commissionRate) {
        super(name, basesalary);
        this.commissionRate = commissionRate;
    }
    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
    }
}

class Manager extends Employee {
    protected double fixedBonus;
    public Manager(String name, double basesalary, double fixedBonus) {
        super(name, basesalary);
        this.fixedBonus = fixedBonus;
    }
    @Override
    public double calculatePay() {
        return baseSalary + fixedBonus;
    }
}

class PayrollProcessor {
    public static void process(Employee e) {
        System.out.println(e.name + " Total Pay: " + e.calculatePay());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String SalesName = sc.nextLine();
        double SalesSalary = sc.nextDouble();
        double SalesRate = sc.nextDouble();
        sc.nextLine();
        String ManagerName = sc.nextLine();
        double ManagerSalary = sc.nextDouble();
        double ManagerBonus = sc.nextDouble();

        SalesEmployee sales = new SalesEmployee(SalesName, SalesSalary, SalesRate);
        Manager manager = new Manager(ManagerName, ManagerSalary, ManagerBonus);
        PayrollProcessor.process(sales);
        PayrollProcessor.process(manager);

        sc.close();
    }
}
