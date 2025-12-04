package Lab3.Lab3P3;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        String initpassword = input.nextLine() ;

        String newpassword = input.nextLine() ;

        User user1 = new User(initpassword) ;

        user1.setPassword(newpassword) ;
        
        System.out.println(user1.getPassword() ) ;

        input.close() ;
    }
}
