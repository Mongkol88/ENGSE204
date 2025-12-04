package Lab3.Lab3P7 ;


public class Employee {
    private String  Employeeid ;
    private String Department ;

    public Employee(String employeeid, String department) {
        this.Employeeid = employeeid ;
        this.Department = department ;
    }

    public String getEmployee() { return this.Employeeid ; }

    public String getDepartment() { return this.Department ; }

    public void setDepartment( String newDepartment ) { this.Department = newDepartment ; }   

}