package Lab3.Lab3P1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        String username = input.nextLine() ;

        User user1 = new User(username) ;

        System.out.println(user1.getUsername());

        input.close();
    }
}