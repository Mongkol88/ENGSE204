package Lab3.Lab3P2;

import java.util.Scanner ;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int initscore = input.nextInt() ;

        int newscore = input.nextInt() ;

        Player plr1 = new Player(initscore) ;

        plr1.setScore(newscore) ;

        System.out.println(plr1.getScore()) ;

        input.close();
    }
}
