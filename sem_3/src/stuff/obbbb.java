package stuff;

public class obbbb {
    String name;
    String age;
    String gender;
    String education;
    String profession;

    public obbbb(String name, String age, String gender, String education, String profession) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.education = education;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "obbbb{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", education='" + education + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
