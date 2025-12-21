package Lab6.Lab6P4;

import java.util.Scanner;

interface Iconfigloader {
    public void loadconfig();
}

class Defaultloader implements Iconfigloader {
    protected String defaultprofile;
    public Defaultloader(String defaultprofile) {
        this.defaultprofile = defaultprofile;
    }
    @Override
    public void loadconfig() {
        System.out.println("Loading Default Profile: " + this.defaultprofile);
    }
}

class userLoader implements Iconfigloader {
    protected String userid;
    public userLoader(String userid) {
        this.userid = userid;
    }
    @Override
    public void loadconfig() {
        System.out.println("Loading User Profile: " + this.userid);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String defaultpro = sc.nextLine();
        String userPro = sc.nextLine();
        Defaultloader defaultload = new Defaultloader(defaultpro);
        userLoader user = new userLoader(userPro);
        Iconfigloader[] configloader = {defaultload, user};
        for (Iconfigloader config : configloader) {
            config.loadconfig();
        }

        sc.close();
    }
}
