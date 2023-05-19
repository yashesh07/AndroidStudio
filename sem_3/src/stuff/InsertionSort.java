package stuff;

import lab_2.Candidate;

public class InsertionSort {
    public Player[] insertionSort(Player [] arr){
        for(int i = 1; i<arr.length; i++){
            Player key = new Player(arr[i].getName(), arr[i].getScore());
            int j;
            for(j = i-1; j>=0 && arr[j].getScore()>key.getScore(); j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
