package Lab4.Lab4P11;

import java.util.Scanner;

class Configuration {
    private String theme;
    private int frontSize;  
    private boolean darkmode;

    public Configuration(String theme, int frontsize, boolean darkmode) {
        if (frontsize < 10) {
            this.frontSize = 10;
        } else if (frontsize > 20) {
            this.frontSize = 20;
        } else { this.frontSize = frontsize; }
        this.theme = theme;
        this.darkmode = darkmode;
    }

    public Configuration(Configuration base, Configuration user) {
        this.theme = user.theme;
        this.darkmode = user.darkmode;
        this.frontSize = base.frontSize;
    }

    public void displaySetting() {
        System.out.println("Theme: " + this.theme + ", Size: " + this.frontSize + ", Dark: " + this.darkmode);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String basetheme = sc.nextLine();
        int basefrontsize = sc.nextInt();
        boolean basedark = sc.nextBoolean();
        sc.nextLine();
        String usertheme = sc.nextLine();
        int userfrontsize = sc.nextInt();
        boolean userdark = sc.nextBoolean();

        Configuration baseConfig = new Configuration(basetheme, basefrontsize, basedark);
        Configuration userConfig = new Configuration(usertheme, userfrontsize, userdark);
        Configuration finalConfig = new Configuration(baseConfig, userConfig);
        finalConfig.displaySetting();
        sc.close();
    }
}
