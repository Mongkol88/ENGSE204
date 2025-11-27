package Lab2.Lab2P12; 

public class Course {
    private String courseid ;
    private String coursename ;

    public Course(String courseid, String coursename) {
        this.courseid = courseid ;
        this.coursename = coursename ;
    }

    public String getCourseInfo() { return this.courseid + " : " + this.coursename ; }
}