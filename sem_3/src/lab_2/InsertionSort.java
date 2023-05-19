package lab_2;

public class InsertionSort {
    public Candidate [] insertionSort(Candidate [] arr){
        for(int i = 1; i<arr.length; i++){
            Candidate key = new Candidate(arr[i].getName(), arr[i].getGender(), arr[i].getAge(), arr[i].getPreferredLanguage(), arr[i].isPhysicallyChallenged(), arr[i].getCaste(), arr[i].getPassingYearOfClass12(), arr[i].getApplicationID());
            key.setRank(arr[i].getRank());
            key.setPercentile(arr[i].getPercentile());
            int j;
            for(j = i-1; j>=0 && Integer.parseInt(arr[j].getRank())>Integer.parseInt(key.getRank()); j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
