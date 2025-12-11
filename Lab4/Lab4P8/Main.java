package Lab4.Lab4P8;

import java.util.Scanner;

class  Movie {
    private String title;
    private String director;
    private double rating;

    public Movie(String title) {
        this(title, "Unknow");
    }
    public Movie(String title, String director) {
        this(title, director, 0.0);
    }
    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        if ( rating > 10.0 ) {
            this.rating = 10.0;
        } else if ( rating < 0 ) {
            this.rating = 0;
        } else { this.rating = rating; }
    }

    public void displayinfo() {
        System.out.println("Title: " + this.title + ", Director: " + this.director + ", Rating: " + this.rating);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mode = sc.nextInt();
        sc.nextLine();

        if (mode == 1) {
            String title = sc.nextLine();
            Movie movie1 = new Movie(title);
            movie1.displayinfo();
        } else if (mode == 2) {
            String title = sc.nextLine();
            String director = sc.nextLine();
            Movie movie1 = new Movie(title, director);
            movie1.displayinfo();
        } else if (mode == 3) {
            String title = sc.nextLine();
            String director = sc.nextLine();
            double rating = sc.nextDouble();
            Movie movie1 = new Movie(title, director, rating);
            movie1.displayinfo();
        }
        sc.close();
    }
}
