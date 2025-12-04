package Lab3.Lab3P9;

class User {
    private String Username ;
    private String Password ;
    private static int minPasswordLength = 8 ;

    public User(String username, String password) {
        if ( password.length() >= minPasswordLength ) {

            this.Password = password ;
            System.out.println("Creation successful") ;

        } else { this.Password = "Invalid" ; System.out.println("Creation Failed") ; }
    }

    public static void setMinLength(int length) {
        if (length < 4) {

            System.out.println("Invalid length");
            
        } else if ( length >= 4 ) {

            minPasswordLength = length ;
            System.out.println("New min length set to " + minPasswordLength);
        }
    }

    public static int getMinlength() { return minPasswordLength ; }


    public void setPassword(String newpassword) {
        if ( newpassword.length() >= minPasswordLength ) {

            this.Password = newpassword ;
            System.out.println("Update successful") ;

        } else { System.out.println("Update Failed") ; }
    }

    public String getPassword() { return this.Password ; }
}


