package Lab5.Lab5P4;

import java.util.Scanner;


class Vehicle {
    protected String color;
    public Vehicle(String color) {
        this.color = color;
    }
}

class Car extends Vehicle {
    protected int wheels;
    public Car(String color, int Wheels) {
        super(color) ;
        this.wheels = Wheels ;
    }
    public void displayDeteils() {
        System.out.println("Color: " + color + ", Wheels: " + this.wheels);
    }
}

public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        String c = sc.nextLine();
        int w = sc.nextInt();

        Car myCar = new Car(c, w);
        myCar.displayDeteils();

        sc.close();
    }
}


