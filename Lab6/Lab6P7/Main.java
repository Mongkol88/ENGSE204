package Lab6.Lab6P7;

import java.util.Scanner;

interface IDrivable {
    public void starengine();
}

abstract class Vehicle implements IDrivable {
    protected int currentspeed;
    public Vehicle(int speed) {
        this.currentspeed = speed;
    }
    public void displayspeed() {
        System.out.println("Current Speed: " + this.currentspeed + " Km/h");
    }
    public abstract void starengine();
}

class Truck extends Vehicle {
    protected int cargoweight;
    public Truck(int speed, int weight) {
        super(speed);
        this.cargoweight = weight;
    }
    public void starengine() {
        System.out.println("Truck engine started. Max cargo: " + this.cargoweight + " tons.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        int weight = sc.nextInt();
        Truck truck = new Truck(speed, weight);
        truck.displayspeed();
        truck.starengine();
        sc.close();
    }
}
