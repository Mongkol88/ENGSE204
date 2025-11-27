package Lab2.Lab2P1;


public class Student {

    private String studentId ;
    private String name ;

    public Student(String ID, String name) {
        this.studentId = ID ;
        this.name = name ;
    }

    public String GetName() {
        return this.name ;
    }

    public String GetID() {
        return this.studentId ;
    }
}


