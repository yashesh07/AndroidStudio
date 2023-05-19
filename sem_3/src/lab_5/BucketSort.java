package lab_5;

import java.util.Arrays;

public class BucketSort {

    public int [] bucketSort(int [] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++)
            if(arr[i]>max)  max = arr[i];
        int numberOfBuckets;
        if(Math.sqrt(max)==(int)Math.sqrt(max)) numberOfBuckets = (int)Math.sqrt(max);
        else numberOfBuckets = (int)Math.sqrt(max) + 1;
        Bucket [] tempArr = new Bucket[numberOfBuckets];
        for(int i = 0; i<tempArr.length; i++)
            tempArr[i] = new Bucket();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%numberOfBuckets==0 && arr[i]>0)   tempArr[(arr[i]/numberOfBuckets)-1].append(arr[i]);
            else tempArr[(arr[i]/numberOfBuckets)].append(arr[i]);
        }
        for(int i = 0; i<tempArr.length; i++)
            new InsertionSort().insertionSort(tempArr[i]);
        int count = 0;
        int i = 0;
        while(i<tempArr.length){
            if(tempArr[i].getSize()>0){
                arr[count++] = tempArr[i].getElement();
                tempArr[i].remove();
            }
            else i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int size = (int) (Math.random()*(150-100+1) + 50);
        int [] arr = new int[size];
        for(int i = 0; i<arr.length; i++)
            arr[i] = (int) (Math.random()*(500+1));
        System.out.println("Input");
        System.out.println(Arrays.toString(arr));
        System.out.println("\nOutput");
        System.out.println(Arrays.toString(new BucketSort().bucketSort(arr)));
    }
}
