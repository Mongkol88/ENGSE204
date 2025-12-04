package Lab3.Lab3P12 ;

public class Employee {
    private String name ;
    private double monthlySalary ;

    public Employee(String name, double monthlySalary) {
        this.name = name ;
        if ( monthlySalary > 0 ) {
            this.monthlySalary = monthlySalary ;
        } else { this.monthlySalary = 0 ; }
    }
    
    public String getName() { return this.name ; }

    public void giveRaise(double amount) {
        if ( amount > 0 ) {
            this.monthlySalary += amount ;
            System.out.println("Raise applied");
        } else { System.out.println("Invalid amount"); }
    }

    private double getAnnulSalary() {
        return this.monthlySalary * 12 ;
    }

    public double calculateTax(double taxRate) {
        return getAnnulSalary() * taxRate ;
    }
}