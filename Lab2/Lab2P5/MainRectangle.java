package Lab2.Lab2P5;


import java.util.Scanner ;


public class MainRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter Width : ");

        double W = input.nextDouble() ;

        System.out.print("Enter Height : ");

        double H = input.nextDouble() ;
        
        Rectangle rectangle1 = new Rectangle(W, H) ;

        System.out.println("Area : " + rectangle1.getArea());

        System.out.println("Perimeter : " + rectangle1.getPerimeter());


        input.close();
    }
}