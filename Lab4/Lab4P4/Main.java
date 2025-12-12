package Lab4.Lab4P4;

import java.util.Scanner ;

class Location {
    private double latitude ;
    private double longitude ;

    public Location(double latitude, double longitude) {
        this.latitude = latitude ;
        this.longitude = longitude ;
    }
    public Location(Location other) {
        this(other.latitude, other.longitude) ;
    }
    public void SetLatitude(double newlatitude) { this.latitude =  newlatitude ;}
    public void displayinfo() {
        System.out.println("Lat : " + this.latitude + ", " + "Lon : " + this.longitude);    
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        double latitude = sc.nextDouble() ;
        double longitude = sc.nextDouble() ;
        double newlat = sc.nextDouble() ;

        Location loc1 = new Location(latitude, longitude) ;
        Location loc2 = new Location(loc1) ;
        loc1.SetLatitude(newlat) ;
        loc1.displayinfo();
        loc2.displayinfo();
        sc.close();
    }
}
