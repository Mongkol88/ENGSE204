package Lab2.Lab2P12;

public class Student {
    private String StudentName ;
    Course enrolledCourse ;

    public Student(String studentname, Course enrolledCourse) {
        this.StudentName = studentname ;
        this.enrolledCourse = enrolledCourse ;
    }

    public void displayEnrollment() {
        System.out.println("Student : " + this.StudentName);
        System.out.println("Enrolled in : " + this.enrolledCourse.getCourseInfo());
    }
}
