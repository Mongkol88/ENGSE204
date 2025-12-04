package Lab3.Lab3P11;

public class SystemConfig {
    private static SystemConfig instance  ;
    private String serverURL ;
    private int maxConnections ;

    private SystemConfig() {
        this.serverURL = "default.server.com" ;
        this.maxConnections = 10 ;
    }

    public static SystemConfig getinstance() {
        if ( instance == null ) {instance = new SystemConfig() ; }
        return instance ;
    }

    public String getServerUrl() { return this.serverURL ; }

    public void setServerUrl(String newServerUrl) { this.serverURL = newServerUrl ; }

    public int getMaxConnections() { return this.maxConnections ; }

    public void SetMaxConnections(int count) {
        if ( count > 0 ) {
            this.maxConnections = count ;
            System.out.println("Max Connections Set.") ;
        } else { System.out.println("Invalid count.") ; }
    }
}
