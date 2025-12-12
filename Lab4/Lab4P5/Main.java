package Lab4.Lab4P5;

import java.util.Scanner ;

class Color {
    private int red ;
    private int green ;
    private int blue ;

    public Color(int r, int g, int b) {
        if ( r > 255 ) {
            this.red = 255 ;
        } else if ( r < 0 ) {
            this.red = 0 ;
        } else { this.red = r ; }
        if ( g > 255 ) {
            this.green = 255 ;
        } else if ( g < 0 ) {
            this.green = 0 ;
        } else { this.green = g ; }
        if ( b > 255 ) {
            this.blue = 255 ;
        } else if ( b < 0 ) {
            this.blue = 0 ;
        } else { this.blue = b ; }
    }
    
    public int getred() {
        return this.red ;
    }
    public int getgreen() {
        return this.green ;
    }
    public int getblue() {
        return this.blue ;
    }
    public void displayRGB() {
        System.out.println("R=" + this.red + ", G=" + this.green + ", B=" + this.blue);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int red = sc.nextInt() ;
        int green  = sc.nextInt() ;
        int blue = sc.nextInt() ;
        Color color = new Color(red, green, blue) ;
        color.displayRGB() ;
        sc.close();
    }
}
