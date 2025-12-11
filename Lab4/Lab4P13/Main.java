package Lab4.Lab4P13;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthUI;

class Subscription {
    private final String planName;
    private final int durationDays;
    private static int maxDuration = 365;

    public Subscription(String planname, int durationday) {
        if (durationday > maxDuration) {
            this.durationDays = maxDuration;
        } else if (durationday < 0) {
            this.durationDays = 0;
        } else { this.durationDays = durationday; }
        this.planName = planname;

    }
    public Subscription(Subscription other) {
        this(other.planName, other.durationDays);
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.println("Max Duration set to " + max);
        } else { System.out.println("invalid max policy."); }
    }
    public Subscription extend(int days) {
        int newDay = this.durationDays + days;
        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        } else  if (newDay > maxDuration) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        } else { 
            System.out.println("Extension successful.");
            return new Subscription(this.planName, newDay);
        }
    }
    
    public void displayinfo() {
        System.out.println("Plan: " + this.planName + ", Days:" + this.durationDays);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxduration = sc.nextInt();
        sc.nextLine();
        String planname = sc.nextLine();
        int duration = sc.nextInt();
        sc.nextLine();
        int extend1 = sc.nextInt();
        sc.nextLine();
        int extend2 = sc.nextInt();
        sc.nextLine();
        Subscription sub1 = new Subscription(planname, duration);
        Subscription.setMaxDuration(maxduration);
        Subscription sub2 = sub1.extend(extend1);
        Subscription Sub3 = sub2.extend(extend2);
        Sub3.displayinfo();
        sc.close();
    }
}
