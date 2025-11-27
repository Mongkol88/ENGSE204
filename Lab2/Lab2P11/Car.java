package Lab2.Lab2P11;

import java.util.Scanner ;

public class Car {
    private String Model ;
    private int Year ;

    public Car(String model, int year) { 
        this.Model = model ;
        this.Year = year ;
    }

    public String getModel() { return this.Model ; }

    public int getYear() { return this.Year ; }

    public void setYear(int newyear) { this.Year = newyear ; }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        String name = input.nextLine() ;

        int year = input.nextInt() ; 

        int newyear = input.nextInt() ;

        Car NewCar1 = new Car(name, year) ;

        NewCar1.setYear(newyear) ;

        System.out.println("Model : " + NewCar1.getModel());

        System.out.println("Year : " + NewCar1.getYear());

        input.close();
    }
}
