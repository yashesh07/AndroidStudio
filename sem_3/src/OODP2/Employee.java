package OODP2;

public class Employee {

//    Here I had taken this attributes as private because I am taking the input of this attribute through constructor
    private String salesmanName;
    private String employeeNumber;
    private int Q1;
    private int Q2;
    private int Q3;
    private int Q4;

//    Constructor
    public Employee(String salesmanName, String employeeNumber, int Q1, int Q2, int Q3, int Q4){
        this.salesmanName = salesmanName;
        this.employeeNumber = employeeNumber;
        this.Q1 = Q1;
        this.Q2 = Q2;
        this.Q3 = Q3;
        this.Q4 = Q4;
    }

//    Method to print details
    public String printDetails(){
        return "\n\n\tSalesman Name : " + this.salesmanName +
                "\n\n\tEmployee Number : " + this.employeeNumber +
                "\n\n\tQ1 : " + this.Q1 +
                "\n\tQ2 : " + this.Q2 +
                "\n\tQ3 : " + this.Q3 +
                "\n\tQ4 : " + this.Q4 +
                "\n\n\tAverage sales : " + (this.Q1 + this.Q2 + this.Q3 + this.Q4)/4;
    }
}
