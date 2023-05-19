package OODP4;

public class Member {

    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private int salary;

    public Member(String name, int age, String phoneNumber, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

//    Method to display the salary of the member
    public int dispSalary(){
        return this.salary;
    }

//    Method to display the details of member
    public String dispDetails(){
        return "\nName: " + this.name +
                "\nAge: " + this.age +
                "\nPhone Number: " + this.phoneNumber +
                "\nAddress: " + this.address +
                "\nSalary: " + this.dispSalary();
    }
}
