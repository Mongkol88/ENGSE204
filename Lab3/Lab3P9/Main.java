package Lab3.Lab3P9;

import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int minlength1 = input.nextInt() ;
        String user1_name = input.next() ;
        String user1_pass = input.next() ;
        String user2_name = input.next() ;
        String user2_pass = input.next() ;      
        int minlength2 = input.nextInt() ;
        String user2_newpass = input.next() ; 

        User.setMinLength(minlength1) ;
        User User1 = new User(user1_name, user1_pass) ;
        User User2 = new User(user2_name, user2_pass) ;
        User.setMinLength(minlength2) ;
        User2.setPassword(user2_newpass) ;
        System.out.println(User1.getPassword()) ;
        System.out.println(User2.getPassword()) ;


        input.close();
    }
}
