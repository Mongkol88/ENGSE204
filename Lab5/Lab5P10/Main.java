package Lab5.Lab5P10;

import java.util.Scanner;

class ProjectTask {
    protected String description;
    protected int baseHours;
    public ProjectTask(String desc, int hour) {
        this.description = desc;
        this.baseHours = hour;
    }
    public double calculateCost() {
        return this.baseHours * 50.0;
    }
}

class ComplexTask extends ProjectTask {
    protected double setupFree;
    public ComplexTask(String desc, int hour, double free) {
        super(desc, hour);
        this.setupFree = free;
    }
    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + this.setupFree;
    }
}

class SimpleTask extends ProjectTask {
    public SimpleTask(String desc, int hour) {
        super(desc, hour);
    }
    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String complexDesc = sc.nextLine();
        int complexHour = sc.nextInt();
        double ComplexFree = sc.nextDouble();
        sc.nextLine();
        String SimpleDesc = sc.nextLine();
        int SimpleHour = sc.nextInt();
        ComplexTask complextask = new ComplexTask(complexDesc, complexHour, ComplexFree);
        SimpleTask simpletask = new SimpleTask(SimpleDesc, SimpleHour);
        ProjectTask[] projectTasks = {complextask, simpletask};
        for (ProjectTask project : projectTasks) {
            System.out.println(project.calculateCost());
        }

        sc.close();
    }
}
