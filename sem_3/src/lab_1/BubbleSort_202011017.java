package lab_1;

public class BubbleSort_202011017 {
    public int [] bubbleSort(int [] arr){
        for(int i = 0; i<arr.length-1; i++){
            boolean swap = false;
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap)   return arr;
        }
        return arr;
    }
}
