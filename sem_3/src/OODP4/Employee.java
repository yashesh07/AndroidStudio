package OODP4;

public class Employee extends Member{

    private String designation;
    private String department;

    public Employee(String name, int age, String phoneNumber, String address, int salary, String designation, String department){
        super(name, age, phoneNumber, address, salary);
        this.designation = designation;
        this.department = department;
    }

//    Overrides the method 'dispDetails' of class Member
    public String dispDetails(){
        return super.dispDetails() +
                "\nDesignation: " + this.designation +
                "\nDepartment: " + this.department;
    }
}
