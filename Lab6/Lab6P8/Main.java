package Lab6.Lab6P8;

import java.util.Scanner;

interface IMaintainable {
    public boolean needMaintenance();
}

abstract class Powergenerator implements IMaintainable {
    protected String name;
    protected double basepower;
    protected int usagehour;
    public Powergenerator(String name,double basepower, int usagehour) {
        this.name = name;
        this.basepower = basepower;
        this.usagehour = usagehour;
    }
    public void incressUsage(int hour) {
        this.usagehour += hour;
    }
    public abstract double getefficiency();
    public double calculateoutput() {
        return basepower * getefficiency();
    }
}

class Solarpanel extends Powergenerator {
    public Solarpanel(String name, double power, int hour) {
        super(name, power, hour);
    }
    @Override
    public double getefficiency() {
        return 0.90;
    }
    @Override
    public boolean needMaintenance() {
        if (usagehour > 100) {
            return true;
        } else {
            return false;
        }
    }
    public double calculatefinaloutput() {
        if (needMaintenance()) {
            return super.calculateoutput() * 0.5;
        } else {
            return super.calculateoutput();
        }
    }
}





public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        double power1 = sc.nextDouble();
        int hour1 = sc.nextInt();
        sc.nextLine();
        String name2 = sc.nextLine();
        double power2 = sc.nextDouble();
        int hour2 = sc.nextInt();
        Solarpanel p1 = new Solarpanel(name1, power1, hour1);
        Solarpanel p2 = new Solarpanel(name2, power2, hour2);
        p1.incressUsage(100);
        Solarpanel[] power = {p1,p2};
        for (Solarpanel solar : power) {
            System.out.println(solar.calculatefinaloutput());
        }
        sc.close();
    }   
}
