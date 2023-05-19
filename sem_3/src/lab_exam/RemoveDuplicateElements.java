package lab_exam;

import java.util.ArrayList;

public class RemoveDuplicateElements {

    private int [] arr;

    public RemoveDuplicateElements(int [] arr){
        this.arr = arr;
    }

    private void sortingElements(){
        new QuickSort().quickSort(arr);
    }

    public int [] removingDuplicateElements(){
        sortingElements();
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                result.add(arr[i]);
            }
        }
        int [] resultArray = new int[result.size()];
        for(int i = 0; i<resultArray.length; i++)
            resultArray[i] = result.get(i);
        return resultArray;
    }

}
