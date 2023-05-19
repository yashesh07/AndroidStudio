package lab_2;

public class Candidate {
    private String name;
    private String gender;
    private int age;
    private String preferredLanguage;
    private boolean physicallyChallenged;
    private String caste;
    private String passingYearOfClass12;
    private String applicationID;
    private String rank;
    private  String percentile;

    public Candidate(String name, String gender, int age, String preferredLanguage, boolean physicallyChallenged, String caste, String passingYearOfClass12, String applicationID) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.preferredLanguage = preferredLanguage;
        this.physicallyChallenged = physicallyChallenged;
        this.caste = caste;
        this.passingYearOfClass12 = passingYearOfClass12;
        this.applicationID = applicationID;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public boolean isPhysicallyChallenged() {
        return physicallyChallenged;
    }

    public String getCaste() {
        return caste;
    }

    public String getPassingYearOfClass12() {
        return passingYearOfClass12;
    }

    public String getApplicationID() {
        return applicationID;
    }

    public String getRank() {
        return rank;
    }

    public String getPercentile() {
        return percentile;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setPercentile(String percentile) {
        this.percentile = percentile;
    }
}
