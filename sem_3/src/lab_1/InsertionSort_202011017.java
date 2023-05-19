package lab_1;

public class InsertionSort_202011017 {
    public int [] insertionSort(int [] arr){
        for(int i = 1; i<arr.length; i++){
            int key = arr[i];
            int j;
            for(j = i-1; j>=0 && arr[j]>key; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
        return arr;
    }
}