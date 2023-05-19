package lab_4;

import java.util.Arrays;

public class Question2 {

    public int [] quickSort(int [] arr){
        quickSort(arr, 0, arr.length);
        return arr;
    }

    private void quickSort(int [] arr, int low, int high){
        if(low<high){
            int pivotIndex = (int) (Math.random()*(high-1-low+1) + low);
            int pivot = arr[pivotIndex];
            int t = arr[low];
            arr[low] = arr[pivotIndex];
            arr[pivotIndex] = t;

            int i = low, j = high;
            while(i<j){
                do{
                    i++;
                }while(i<high && arr[i]<=pivot);
                do{
                    j--;
                }while(arr[j]>pivot);
                if(i<j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
            quickSort(arr, low, j);
            quickSort(arr, j+1, high);
        }
    }

    public static void main(String[] args) {
        int size = 25;
        int [] a = new int[size];
        for(int i = 0; i<size; i++)
            a[i] = (int) (Math.random()*(1200-1+1) + 1);
        int [] w = a.clone();
        int [] b = a.clone();
        new Question2().quickSort(w);
        System.out.println("\nInput size: " + size);
        long start = System.nanoTime();
        new Question2().quickSort(w);
        long end = System.nanoTime();
        System.out.println("\nTime for worst case in nanoseconds: " + (end-start));
        start = System.nanoTime();
        new Question2().quickSort(a);
        end = System.nanoTime();
        System.out.println("\nTime for average case in nanoseconds: " + (end-start));
        start = System.nanoTime();
        new Question2().quickSort(b);
        end = System.nanoTime();
        System.out.println("\nTime for best case in nanoseconds: " + (end-start));
    }
}
