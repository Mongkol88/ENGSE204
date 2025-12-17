package Lab5.Lab5P9;

import java.util.Scanner;

class Item {
    protected String name;
    public Item(String name) {
        this.name = name;
    }
    public double getValue() { return 0.0; }
}

class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quanlity;
    public PhysicalProduct(String name, double unitPrice, int quanlity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quanlity = quanlity;
    }
    @Override
    public double getValue() {
        return unitPrice * quanlity;
    }
}

class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;
    public DigitalSubscription(String name, double monthlycost, int months) {
        super(name);
        this.monthlyCost = monthlycost;
        this.months = months;
    }
    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String physicalName = sc.nextLine();
        double physicalUnitPrice = sc.nextDouble();
        int physicalQuanity = sc.nextInt();
        sc.nextLine();
        String SubscriptionName = sc.nextLine();
        double subscriptionMonthlyCost = sc.nextDouble();
        int subscriptionMonths = sc.nextInt();

        PhysicalProduct physicalproduct = new PhysicalProduct(physicalName, physicalUnitPrice, physicalQuanity);
        DigitalSubscription digitalSubscription = new DigitalSubscription(SubscriptionName, subscriptionMonthlyCost, subscriptionMonths);
        Item[] items = {physicalproduct, digitalSubscription};
        double total = 0;
        for (Item item : items) {
            total += item.getValue();
        }
        System.out.println(total);

        sc.close();
    }
}
