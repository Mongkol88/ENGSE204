package Lab4.Lab4P12;

import java.util.Scanner;

class Schedule {
    private int hour;

    public Schedule(int hour) { this.hour = hour;}
    public void setHour(int newhour) { this.hour = newhour; }
    public int getHour() { return this.hour; }

    public Schedule(Schedule other) { this.hour = other.hour; }
}

class EmployeeSchedule {
    private String name;
    private Schedule schedule;

    public EmployeeSchedule(String name, Schedule schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public EmployeeSchedule(EmployeeSchedule other) {
        this.name = other.name; 
        this.schedule = new Schedule(other.schedule.getHour());
    }

    public void displaySchedule() {
        System.out.println(this.name + ": " + schedule.getHour() + ":00");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int inithour = sc.nextInt();
        int newhour = sc.nextInt();

        Schedule sch1 = new Schedule(inithour);
        EmployeeSchedule emp1 = new EmployeeSchedule(name, sch1);
        EmployeeSchedule emp2 = new EmployeeSchedule(emp1);
        sch1.setHour(newhour);
        emp1.displaySchedule();
        emp2.displaySchedule();


        sc.close();
    }
}
