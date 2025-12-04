package Lab3.Lab3P3;

public class User {
    private String Password ;


    public User(String initialPassword) {
        this.Password = initialPassword ;
    }

    public String getPassword() { return this.Password ; }

    public void setPassword(String newpassword) { 
        if ( newpassword.length() >= 8 ) {
            this.Password = newpassword ; 
            System.out.println("Password updated.") ;
        } else {
            System.out.println("Password is too short.") ;
        }
    }
}
