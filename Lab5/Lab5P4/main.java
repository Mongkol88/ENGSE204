package Lab5.Lab5P4;

import java.util.Scanner;

class Vehicle {
    protected String color;
    public Vehicle(String color) {
        this.color = color;
    }
}

class Car extends Vehicle {
    protected int Wheels;
    public Car(String color, int Wheels) {
        super(color);
        this.Wheels = Wheels;
    }
    public void displayDeteils() {
        System.out.println("Color: " + color + ", Wheels: " + this.Wheels);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
        int wheels = sc.nextInt();

        Car car = new Car(color, wheels);
        car.displayDeteils();

        sc.close();
    }
}
