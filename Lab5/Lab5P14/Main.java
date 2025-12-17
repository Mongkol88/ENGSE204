package Lab5.Lab5P14;

import java.util.Scanner;

class Shipping {
    protected String trackingld;
    protected double baseFee;
    public Shipping(String id, double baseFee) {
        this.trackingld = id;
        this.baseFee = baseFee;
    }
    public double calculateTotalFee() {
        return this.baseFee;
    }
}

class StandardShipping extends Shipping {
    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
    }
    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;
    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }
    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + this.insuranceFee;
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String standardid = sc.nextLine();
        double standardfee = sc.nextDouble();
        sc.nextLine();
        String premiumid = sc.nextLine();
        double premiumbasefee = sc.nextDouble();
        double PremiuminsFee = sc.nextDouble();

        StandardShipping standardshipping = new StandardShipping(standardid, standardfee);
        PremiumShipping premiumshipping = new PremiumShipping(premiumid, premiumbasefee, PremiuminsFee);
        Shipping[] shipping = {standardshipping, premiumshipping};
        for (Shipping ship : shipping) {
            System.out.println(ship.calculateTotalFee());
        }
        sc.close();
    }
}
