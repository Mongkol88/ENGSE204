package Lab5.Lab5P3;

import java.util.Scanner;

class Employee {
    protected double salary;
    public double calculateBonus() {
        return this.salary / 100 * 10;
    }
}

class Manager extends Employee {
    @Override
    public double calculateBonus() {
        return super.calculateBonus() / 10 * 15;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        Manager manager = new Manager();
        manager.salary = salary;
        System.out.println(manager.calculateBonus());
        sc.close();
    }
}
