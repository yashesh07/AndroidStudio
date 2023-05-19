package lab_5;

import java.util.ArrayList;

public class InsertionSort {
    public void insertionSort(Bucket b){
        int [] arr = new int[b.list.size()];
        for(int i = 0; i<arr.length; i++)
            arr[i] = b.list.get(i);
        for(int i = 1; i<arr.length; i++){
            int key = arr[i];
            int j;
            for(j = i-1; j>=0 && arr[j]>key; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i<arr.length; i++)
            l.add(i, arr[i]);
        b.list = l;
    }
}
