package Lab2.Lab2P2;


public class StudentLab2 {

    private String studentId ;
    private String name ;

    public StudentLab2(String ID, String name) {
        this.studentId = ID ;
        this.name = name ;
    }


    public void displayInfo() {
        System.out.println("ID : " + studentId);
        System.out.println("Name : " + name);
    }
}


