package Lab2.Lab2P3;


public class StudentLab3 {

    private String studentId ;
    private String name ;
    public static int studentCount = 0 ;

    public StudentLab3(String ID, String name) {
        this.studentId = ID ;
        this.name = name ;

        StudentLab3.studentCount++;
    }

    public String GetName(String n) {
        return this.name ;
    }

    public String GetID(String ID) {
        return this.studentId ;
    }
}


