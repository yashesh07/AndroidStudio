package lab_8;

public class Question1 {

    int minimumNumberOfChargingStops(int n, int [] chargingStops){

        int requiredNumberOfChargingStops = 0;
        int distance = 0;

//        Verifying that the distance of charging stop is less than motor's bike capacity.
        for(int i = 0; i<chargingStops.length; i++){
            if(chargingStops[i]>n)  return -1;
        }

//        Calculating minimum number of charging stops and assuming that it has full charged at the beginning of the journey.
        for(int i = 0; i<chargingStops.length; i++){
            distance = distance + chargingStops[i];
            if(distance>n){
                requiredNumberOfChargingStops++;
                distance = chargingStops[i];
            }
        }

        return requiredNumberOfChargingStops;
    }

}

class Driver {
    public static void main(String[] args) {

        int numberOfStations = 5;
        int [] chargingStops = {10, 50, 75, 50, 25, 30};
        int n = 100;

        System.out.println(new Question1().minimumNumberOfChargingStops(100, chargingStops));

    }
}
