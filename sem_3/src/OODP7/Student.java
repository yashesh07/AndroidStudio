package OODP7;

public class Student {
    private String name;
    private String ID;
    private int age;

    public Student(){
        this.name = "Yashesh";  //Default name
        this.ID = "202011017";  //Default ID
        this.age = 19;          //Default age
    }

    public Student(String name){
        this.name = name;
        this.ID = "202011017";  //Default ID
        this.age = 19;          //Default age
    }

    public Student(String name, String ID){
        this.name = name;
        this.ID = ID;
        this.age = 19;          //Default age
    }

    public Student(String name, String ID, int age){
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String display(){
        return  "\n\nName: " + this.name +
                "\nID: " + this.ID +
                "\nAge: " + this.age;
    }
}

class Driver {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Franklin");
        Student student3 = new Student("Trevor", "22003699");
        Student student4 = new Student("Jimmy", "29933454", 25);

        System.out.println(student1.display());
        System.out.println(student2.display());
        System.out.println(student3.display());
        System.out.println(student4.display());

    }
}
