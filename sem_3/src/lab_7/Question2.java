package lab_7;

import java.util.Arrays;

public class Question2 {

    String [] startTime;
    String [] endTime;

    Question2(String [] startTime, String [] endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getMinimumNumberOfClassroom(){
        int count = 1;

        int upperBound = Integer.parseInt(endTime[0].split(":",2)[0] + endTime[0].split(":",2)[1]);
        int lowerBound = upperBound;

        for(int i = 1; i<startTime.length; i++){
            int start = Integer.parseInt(startTime[i].split(":",2)[0] + startTime[i].split(":",2)[1]);
            int end = Integer.parseInt(endTime[i].split(":",2)[0] + endTime[i].split(":",2)[1]);
            if(start>=lowerBound){
                if(start>=upperBound && count==1){
                    upperBound = end;
                    lowerBound = upperBound;
                }
                else{
                    lowerBound = Math.min(upperBound, end);
                    upperBound = Math.max(upperBound, end);
                }
            }
            else{
                count++;
                lowerBound = Math.min(upperBound, end);
                upperBound = Math.max(upperBound, end);
            }
        }
        return count;
    }
}

class Driver2 {
    public static void main(String[] args) {
        String [] startTime = {"9:00", "9:30", "9:30", "9:40", "9:50", "10:00"};
        String [] endTime = {"10:00", "10:00", "14:00", "9:50", "14:00", "11:00"};

        System.out.println("Input:\n");
        System.out.println("Start time : " + Arrays.toString(startTime));
        System.out.println("End time : " + Arrays.toString(endTime));

        System.out.println("\nOutput\n");
        System.out.println("Minimum number of classrooms required : " + new Question2(startTime, endTime).getMinimumNumberOfClassroom());

    }
}
