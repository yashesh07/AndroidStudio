package OODP3;

public class Employee {
    private String name;
    private int employeeID;
    private boolean above18;

    public Employee(String name, int employeeID, boolean above18) {
        this.name = name;
        this.employeeID = employeeID;
        this.above18 = above18;
    }
    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }
    public Employee(String name) {
        this.name = name;
    }

    public String display(){
        return "Name: " + name +
                "\nemployee ID: " + employeeID +
                "\nAbove 18? " + above18;
    }

    public static void main(String[] args) {
        Employee obj = new Employee("yashesh", 17, true);
        System.out.println("\n\nObject 1: \n");
        System.out.println(obj.display());
        Employee obj2 = new Employee("yashesh", 17);
        System.out.println("\n\nObject 2: \n");
        System.out.println(obj2.display());
        Employee obj3 = new Employee("yashesh");
        System.out.println("\n\nObject 3: \n");
        System.out.println(obj3.display());
    }
}
