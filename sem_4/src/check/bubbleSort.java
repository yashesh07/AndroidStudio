package check;

public class bubbleSort {

    public static void main(String[] args) {
        int [] arr = {};
    }

    public void sort(int [] arr){

        boolean swap = true;

        while(swap){
            swap = false;
            for(int i = 0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = arr[i];
                    swap = true;
                }
            }
        }

    }

}
