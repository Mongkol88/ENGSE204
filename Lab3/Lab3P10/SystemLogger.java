package Lab3.Lab3P10 ;

public class SystemLogger {
    private static int currentLogLevel = 1 ;

    public static String getLevelName(int level) {
        if ( level == 1 ) { return "INFO" ; } else if ( level == 2 ) { return "DEBUG" ; } else if ( level == 3 ) { return "ERROR" ;  } else { return "UNKNOW" ; }
    }

    public static void setLogLevel(int newlevel) {
        if ( newlevel >= 1 && newlevel <= 3 ) {
            currentLogLevel = newlevel ;
            System.out.println("Log Level set to " + getLevelName(newlevel));
        } else { System.out.println("Invalid log level"); }
    }

    public static void log(int messageLevel, String massage) {
        if ( messageLevel >= currentLogLevel ) { System.out.printf("[%s]: %s", getLevelName(messageLevel), massage) ; }
    }

    
}