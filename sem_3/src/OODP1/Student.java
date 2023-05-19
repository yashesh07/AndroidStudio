package OODP1;

public class Student {
    private String name;
    private String std;
    private String ID;
    private String no_of_subjects;

//    Constructor
    public Student(String name, String std, String ID, String no_of_subjects){
        this.name = name;
        this.std = std;
        this.ID = ID;
        this.no_of_subjects = no_of_subjects;
    }

//    Method to set data
    public void setData(String name, String std, String ID, String no_of_subjects){
        this.name = name;
        this.std = std;
        this.ID = ID;
        this.no_of_subjects = no_of_subjects;
    }

//    Method to print details of student
    public String displayData(){
        return "Name \t: " + this.name + "\nstd \t: " + this.std + "\nID \t: " + this.ID + "\nNo of Subjects \t: " + this.no_of_subjects;
    }

}
