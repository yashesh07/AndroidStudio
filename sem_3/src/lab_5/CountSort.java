package lab_5;

import java.util.Arrays;

public class CountSort {

    public int [] countSort(int [] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++)
            if(arr[i]>max)  max = arr[i];
        int [] tempArr = new int[max+1];
        for(int i = 0; i<arr.length; i++)
            tempArr[arr[i]]++;
        int count = 0;
        int i = 0;
        while(i<tempArr.length){
            if(tempArr[i]>0){
                arr[count++] = i;
                tempArr[i]--;
            }
            else i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int size = (int) (Math.random()*(100-50+1) + 50);
        int [] arr = new int[size];
        for(int i = 0; i<arr.length; i++)
            arr[i] = (int) (Math.random()*(25+1));
        System.out.println("Input");
        System.out.println(Arrays.toString(arr));
        System.out.println("\nOutput");
        System.out.println(Arrays.toString(new CountSort().countSort(arr)));
    }
}
