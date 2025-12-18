package Lab5.Lab5P15;

import java.util.Scanner;

class RentalVehicle {
    protected String model;
    protected double rentalRate;
    public RentalVehicle(String model, double rentalrate) {
        this.model = model;
        this.rentalRate = rentalrate;
    }
    public double calculateFee() {
        return this.rentalRate;
    }
}

class Car extends RentalVehicle {
    public Car(String model, double rentalrate) {
        super(model, rentalrate);
    }
    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle {
    public Motorcycle(String moString, double rentalrate) {
        super(moString, rentalrate);
    }
    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String carName = sc.nextLine();
        double carRate  = sc.nextDouble();
        sc.nextLine();
        String motoName = sc.nextLine();
        double motoRate = sc.nextDouble();

        Car car = new Car(carName, carRate);
        Motorcycle moto = new Motorcycle(motoName, motoRate);
        RentalVehicle[] rentalVehicles = {car, moto};
        double totalfee = 0;
        for (RentalVehicle vehicle : rentalVehicles) {
            totalfee += vehicle.calculateFee();
        }
        System.out.println(totalfee);
        sc.close();
    }
}
