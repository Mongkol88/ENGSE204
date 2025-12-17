package Lab5.Lab5P12;

import java.util.Scanner;

class service {
    protected String name;
    protected double basePrice;
    public service(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }
    public double calculateFinalPrice() {
        return this.basePrice;
    }
}

class BasicService extends service {
    public BasicService(String name, double baseprice) {
        super(name, baseprice);
    }
    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.05;
    }
}

class PremiumService extends service {
    protected double premiumRate = 0.15;
    public PremiumService(String name, double baseprice, double premiumrate) {
        super(name, baseprice);
        this.premiumRate = premiumrate;
    }
    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 + premiumRate);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String basicname = sc.nextLine();
        double basicBaseprice = sc.nextDouble();
        sc.nextLine();
        String premiumname = sc.nextLine();
        double premiumBaseprice = sc.nextDouble();
        double premiumRate = sc.nextDouble();

        BasicService basicservice = new BasicService(basicname, basicBaseprice);
        PremiumService premiumservice = new PremiumService(premiumname, premiumBaseprice, premiumRate);
        service[] services = {basicservice, premiumservice};
        for (service service : services) {
            System.out.println(service.calculateFinalPrice());
        }
        sc.close();
    }
}
