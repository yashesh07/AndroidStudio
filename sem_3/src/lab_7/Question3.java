package lab_7;

import java.util.Arrays;

public class Question3 {

    int [][] cost;
    int numberOfStations;

    Question3(int numberOfStations, int [][] cost){
        this.numberOfStations = numberOfStations;
        this.cost = cost;
    }

    public int findMinimumCost(){
        int [] destination = new int[numberOfStations];

        for(int i = 0; i<numberOfStations; i++)
            destination[i] = Integer.MAX_VALUE;

        destination[0] = 0;

        for(int i = 0; i<numberOfStations; i++){
            for(int j = i+1; j<numberOfStations; j++){
                if(cost[i][j]>=0 && (cost[i][j] + destination[i])<destination[j])    destination[j] = cost[i][j] + destination[i];
            }
        }
        return destination[numberOfStations-1];
    }
}

class Driver3 {
    public static void main(String[] args) {
        int numberOfStations = 5;
        int [][] cost = {{0,231,134,351,523}, {-1, 0, 332, 443, 643}, {-1,-1,0,252,422}, {-1,-1,-1,0,112}, {-1,-1,-1,-1,0}};
        System.out.println("Input:\n");
        System.out.println("Number of stations : " + numberOfStations);
        for(int i = 0; i<numberOfStations; i++) {
            for (int j = i + 1; j < numberOfStations; j++)
                System.out.print(cost[i][j] + " ");
            System.out.print("\n");
        }

        System.out.println("Output\n");
        System.out.println("Minimum Cost: " + new Question3(numberOfStations, cost).findMinimumCost());
    }
}
