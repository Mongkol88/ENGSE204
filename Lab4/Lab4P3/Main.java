package Lab4.Lab4P3;

import java.util.Scanner ;

class Player {
    private String username ; 
    private int level ;

    public Player() {
        this.username = "Guest" ;
        this.level = 1 ;
    }

    public Player(String username, int level) {
        this.username = username ;
        this.level = level ;
    }

    public void displayinfo() {
        System.out.println("User : " + this.username + ", " + "Level : " + this.level);    
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int mode = sc.nextInt() ;

        sc.nextLine();
        if ( mode == 1 ) {
            Player player = new Player() ;
            player.displayinfo();
        } else if ( mode == 2 ) {
            String username = sc.nextLine() ;
            int level = sc.nextInt() ;
            Player player = new Player(username, level) ;
            player.displayinfo();
        }
        sc.close();
    }
}
