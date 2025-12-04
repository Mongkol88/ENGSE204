package Lab3.Lab3P13 ;


public class LicenseManager {
    private static int maxLicenses = 10 ;
    private static int usedLicenses = 0 ;

    public static void SetMax(int max) {
        if ( max < 0 ) {
            System.out.println("Invalid max value") ;
        } else if ( max < usedLicenses ) {
            System.out.println("Cannot set max lower than current usage") ;
        } else {
            maxLicenses = max ;
            System.out.println("Max licenses set to " + max) ;
        }
    }

    public static boolean checkout() {
        if ( usedLicenses < maxLicenses ) {
            usedLicenses++;
            System.out.println("Checkout Successful.") ;
            return true ;
        } else if (usedLicenses >= maxLicenses ) {
            System.out.println("Checkout failed: No licenses available.") ;
            return false ;
        } else { return false ; }
    }

    public static void checkIn() {
        if ( usedLicenses > 0 ) {
            usedLicenses--;
            System.out.println("Check-In Successful.") ;
        } else { System.out.println("Nothing to Check-In.") ; }
    }

    public static void displaystatus() {
        System.out.println("Used: " + usedLicenses) ;
        System.out.println("Available: " + (maxLicenses - usedLicenses)) ;
    }
}