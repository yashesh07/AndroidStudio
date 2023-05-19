package OODP7;

class InstituteCourseInstructor {

    protected void instituteCourseMaterials(){
        System.out.println("Course material can only access by the students of institute");
    }

    protected void instituteResources(){
        System.out.println("Institute resources can only access by the students of institute");
    }

    private void examPaperAnswers(){
        System.out.println("Exam papers answer can only be accessed by course instructor");
    }

    private void changeSyllabus(){
        System.out.println("Only course instructor can change the syllabus");
    }

    public void printDetails(){
        instituteCourseMaterials();
        instituteResources();
        examPaperAnswers();
        changeSyllabus();
    }
}

class Student1{

    InstituteCourseInstructor i = new InstituteCourseInstructor();

    public Student1(){
        i.instituteCourseMaterials();
        i.instituteResources();
    }
}

public class MainClass {
    public static void main(String[] args) {
        System.out.println("\nStudent class:");
        new Student1();
        System.out.println("\nCourse Instructor class:");
        new InstituteCourseInstructor().printDetails();
    }
}
