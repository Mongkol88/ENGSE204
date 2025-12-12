package Lab4.Lab4P7;

import java.util.Scanner;



class Resource {
    private String id;
    
    public Resource(String id) {
        this.id = id;
        System.out.printf("Resource [%s] Created.\n", this.id) ;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Resource [%s] finalized (Destroyed).\n", this.id) ;
        super.finalize();
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String id1 = sc.nextLine();
        String id2 = sc.nextLine();
        String id3 = sc.nextLine();

        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);
        r1 = null;
        r2 = null;
        System.gc();
        r3 = null;
        System.gc();
        sc.close();
    }
}
