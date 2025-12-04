package Lab3.Lab3P5;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        String connectionString = input.nextLine() ;

        DatabaseConnection database1 = new DatabaseConnection(connectionString) ;

        database1.connect() ; 

        database1.disconnected();

        database1.disconnected();

        System.out.println(database1.isConnected()) ;

        input.close();
    }
}
