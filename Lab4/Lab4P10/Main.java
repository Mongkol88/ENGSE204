package Lab4.Lab4P10;

import java.util.Scanner ;

class TimePeriod {
    private int startHour;
    private int endHour;

    public TimePeriod() {
        this(9, 17);
    }
    public TimePeriod(int startHour, int endHour) {
        if (startHour > 0 && startHour < 23) {
            this.startHour = startHour;
        } else if (startHour < 0) {
            startHour = 0;
        } else if (startHour > 23) {
            startHour = 23;
        }
        if (endHour > 0 && endHour < 23) {
            this.endHour = endHour;
        } else if (endHour < 0) {
            endHour = 0;
        } else if (endHour > 23) {
            endHour = 23;
        }
        if (startHour > endHour) {
            startHour = startHour + endHour;
            endHour = startHour - endHour;
            startHour = startHour - endHour;
        }
        this.startHour = startHour; 
        this.endHour = endHour;
    }
    public void displayPeriod() {
        System.out.println(this.startHour + ":00" + " - " + this.endHour + ":00");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mode = sc.nextInt();

        if (mode == 1) {
            TimePeriod time = new TimePeriod();
            time.displayPeriod();
        } else if (mode == 2) {
            int startHour = sc.nextInt();
            int endHour = sc.nextInt();
            TimePeriod time = new TimePeriod(startHour, endHour);
            time.displayPeriod();
        }

        sc.close();
    }
}
