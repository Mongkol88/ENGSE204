package Lab4.Lab4P1;

import java.util.Scanner ;

class Book {
    private String title ;
    private String author ;

    public Book(String title) {
        this.title = title ;
        this.author = "Unknow" ;
    }

    public Book(String title, String author) {
        this.title = title ;
        this.author = author ;
    }

    public void displayinfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int mode = sc.nextInt() ;
        sc.nextLine();
        if ( mode == 1 ) {
            String title1 = sc.nextLine() ;
            Book book1 = new Book(title1) ;
            book1.displayinfo() ;
        } else if ( mode == 2 ) {
            String title2 = sc.nextLine() ;

            String author1 = sc.nextLine() ;
            Book book2 = new Book(title2, author1) ;

            book2.displayinfo() ;
        } 
        sc.close();
    }
}