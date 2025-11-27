package Lab2.Lab2P4;

public class Student {
    private String name ;
    private int midterm ;
    private int finalScore ;

    public Student(String name, int midterm, int finalScore) {
        this.name = name ;
        this.midterm = midterm ;
        this.finalScore = finalScore ;
    }

    public double calculateAverage(int midterm, int finalScore) {
        return (double) (midterm + finalScore) / 2.0 ;
    }

    public void displaySummary() {
        String result = (calculateAverage(this.midterm, this.finalScore) >= 50) ? "Pass" : "Fail" ;
        System.out.println("Name : " + this.name) ;
        System.out.println("Average Score : " + calculateAverage(this.midterm, this.finalScore)) ;
        System.out.println("Status : " + result) ;
    }

}
