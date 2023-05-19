package lab_2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Examination {
    private Candidate [] list;
    private int numberOfCandidates;
    private boolean isRegistrationStart = false;
    private boolean isResultDeclared = false;

    public Examination(int numberOfCandidates) {
        this.numberOfCandidates = numberOfCandidates;
        list = new Candidate[numberOfCandidates];
    }

    public void startRegistration(){
        isRegistrationStart = true;
        for(int i = 0; i<numberOfCandidates; i++){
            String name = randomNameGenerator();
            String gender = randomGenderGenerator();
            int age = (int) (Math.random() * (22 - 17 + 1) + 17);;
            String preferredLanguage = randomLanguageGenerator();
            boolean physicallyChallenged = randomPhysicallyChallengedGenerator();
            String caste = randomCasteGenerator();
            String passingYearOfClass12 = randomPassingYearGenerator();
            String applicationID = randomApplicationIDGenerator();
            Candidate c = new Candidate(name, gender, age, preferredLanguage, physicallyChallenged, caste, passingYearOfClass12, applicationID);
            list[i] = c;
        }
        System.out.println("\n\nRegistration successful\n\n");
    }

    public void printCandidateDetails(){
        if(isRegistrationStart){
            for(int i = 0; i<numberOfCandidates; i++)
                System.out.println((i+1) + ".\t" + "Name: " + list[i].getName() + "\t\tApplication ID: " + list[i].getApplicationID() + "\n");
        }
        else System.out.println("Registration not started yet.");
    }

    public void declareResult(){
        isResultDeclared = true;
        if(!isRegistrationStart) System.out.println("Registration not started yet.");
        else{
            for(int i = 0; i<numberOfCandidates; i++){
                list[i].setRank(String.valueOf(ThreadLocalRandom.current().nextInt(1,numberOfCandidates)));
                int rank = Integer.parseInt(list[i].getRank());
                float percentile = ((float) (numberOfCandidates-rank)*100)/(float)(numberOfCandidates-1);
                list[i].setPercentile(String.valueOf(percentile));
            }
            System.out.println("\n\nResult declared!!\n\n");
        }
    }

    public void printCandidatesResult(){
        if(!isResultDeclared)   System.out.println("Result not declared yet.");
        else{
            for(int i = 0; i<numberOfCandidates; i++)
                System.out.println((i+1) + ".\t" + "Name: " + list[i].getName() + "\t\tApplication ID: " + list[i].getApplicationID() + "\t\t AIR: " + list[i].getRank() + "\t\tPercentile Rank: " + list[i].getPercentile() + "\n");
        }
    }

    public void printRankList(){
        if(!isResultDeclared)   System.out.println("Result not declared yet.");
        else{
            Candidate [] arr = list.clone();
            new InsertionSort().insertionSort(arr);
            for(int i = 0; i<numberOfCandidates; i++)
                System.out.println((i+1) + ".\t" + "Name: " + arr[i].getName() + "\t\tApplication ID: " + arr[i].getApplicationID() + "\t\t AIR: " + arr[i].getRank() + "\t\tPercentile Rank: " + arr[i].getPercentile() + "\n");
        }
    }

    public void printIndividualResult(String ID){
        if(!isResultDeclared)   System.out.println("Result not declared yet.");
        else{
            Candidate [] arr = list.clone();
            int index = new LinearSearch().linearSearch(arr, ID);
            if(index==-1) System.out.println("Invalid Application ID");
            else{
                System.out.println("\n\n\t\t----Candidate Details----\n\n"+
                        "\n\n\tName: " + arr[index].getName() +
                        "\n\n\tGender: " + arr[index].getGender() +
                        "\n\n\tAge: " + arr[index].getAge() +
                        "\n\n\tPreferred Language: " + arr[index].getPreferredLanguage() +
                        "\n\n\tPhysically Challenged: " + arr[index].isPhysicallyChallenged() +
                        "\n\n\tCaste: " + arr[index].getCaste() +
                        "\n\n\tPassing year of class 12: " + arr[index].getPassingYearOfClass12() +
                        "\n\n\t\t----Result Details----\n\n"+
                        "\n\n\tApplication ID: " + arr[index].getApplicationID() +
                        "\n\n\tAIR Rank: " + arr[index].getRank() +
                        "\n\n\tPercentile Rank: " + arr[index].getPercentile());
            }
        }
    }

    private String randomNameGenerator(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = (int) (Math.random() * (8 - 6 + 1) + 6);
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)(random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    private String randomGenderGenerator(){
        int n = (int) (Math.random() * (3 - 1 + 1) + 1);
        if(n==1)    return "male";
        else if(n==2)   return "female";
        else return "others";
    }

    private String randomLanguageGenerator(){
        int n = (int) (Math.random() * (3 - 1 + 1) + 1);
        if(n==1)    return "Hindi";
        else if(n==2)   return "Gujarati";
        else return "English";
    }

    private boolean randomPhysicallyChallengedGenerator(){
        int n = (int) (Math.random());
        return n % 2 == 0;
    }

    private String randomCasteGenerator(){
        int n = (int) (Math.random() * (5 - 1 + 1) + 1);
        if(n==1)    return "General-EWS";
        else if(n==2)   return "OBC";
        else if(n==3)   return "SC";
        else if(n==4)   return "ST";
        else return "General";
    }

    private String randomPassingYearGenerator(){
        int n = (int) (Math.random() * (3 - 1 + 1) + 1);
        if(n==1)    return "2019";
        else if(n==2)   return "2020";
        else return "2021";
    }

    private String randomApplicationIDGenerator(){
        return String.valueOf(ThreadLocalRandom.current().nextInt(200000000,299999999));
    }
}
