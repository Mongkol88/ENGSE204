package Lab3.Laba3P15;

public class User {
    private String username ;
    private int failedAttempts ;
    private boolean isLocked ;
    private static int maxAttempts = 3 ;

    public User(String username) {
        this.username = username ;
        this.failedAttempts = 0 ;
        this.isLocked = false ;
    }

    public static void setPolicy(int max) {
        if ( max > 0 ) {
            maxAttempts = max ;
            System.out.println("Policy Updated.");
        } else { System.out.println("Invalid Policy."); }
    }

    public String getUsername() { return this.username ; }

    public boolean isLocked() { return this.isLocked ; }

    public int getFailedAttempts() { return this.failedAttempts ; }

    public void login(String password) {
        if (this.isLocked) {
            System.out.println("Account is Locked.");
        } else if ( !this.isLocked && password.equals("pass123") ) {
            this.failedAttempts = 0;
            System.out.println("Login successful.");
        } else if ( !this.isLocked && !password.equals("pass123")) {
            this.failedAttempts++;
            if ( this.failedAttempts >= maxAttempts ) {
                this.isLocked = true ;
                System.out.println("Login failed. Account Locked.");
            } else { System.out.println("Login failed. " + (maxAttempts - this.failedAttempts) + " attempts left." ); }
        }
    }
}
