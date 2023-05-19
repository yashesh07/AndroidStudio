package lab_5;

import java.util.Arrays;

public class RadixSort {

    public int[] radixSort(int [] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++)
            if(arr[i]>max)  max = arr[i];
        for(int i = 1; (max/i)>0; i*=10)
            radixSort(arr, i);
        return arr;
    }

    private void radixSort(int [] arr, int exp){
        Bucket [] tempArr = new Bucket[10];
        for(int i = 0; i<tempArr.length; i++)
            tempArr[i] = new Bucket();
        for(int i = 0; i<arr.length; i++)
            tempArr[(arr[i]/exp)%10].append(arr[i]);
        int count = 0;
        int i = 0;
        while(i<tempArr.length){
            if(tempArr[i].getSize()>0){
                arr[count++] = tempArr[i].getElement();
                tempArr[i].remove();
            }
            else i++;
        }
    }

    public static void main(String[] args) {
        int size = (int) (Math.random()*(100-50+1) + 50);
        int [] arr = new int[size];
        for(int i = 0; i<arr.length; i++)
            arr[i] = (int) (Math.random()*(1000+1));
        System.out.println("Input");
        System.out.println(Arrays.toString(arr));
        System.out.println("\nOutput");
        System.out.println(Arrays.toString(new RadixSort().radixSort(arr)));
    }
}
