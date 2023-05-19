package lab_3;

public class Question3 {

    public int countNumberOfInteger(int [] arr, int key){
        return countNumberOfInteger(arr, key, 0, arr.length-1);
    }

    private int countNumberOfInteger(int [] arr, int key, int start, int end){
        if(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key)   return 1 + countNumberOfInteger(arr, key, start, mid-1) + countNumberOfInteger(arr, key, mid+1, end);
            else return countNumberOfInteger(arr, key, start, mid-1) + countNumberOfInteger(arr, key, mid+1, end);
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] arr = new int[100000];
        for(int i = 0; i<100000; i++){
            arr[i] = (int) (Math.random()*(100+1));
        }
        int key = (int) (Math.random()*(100+1));
        System.out.println("Key : " + key);
        System.out.println("\nFrequency of key in array of size 10000: " + new Question3().countNumberOfInteger(arr, key));
    }
}
