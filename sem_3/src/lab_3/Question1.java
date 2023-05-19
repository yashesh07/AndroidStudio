package lab_3;

import java.util.Arrays;

public class Question1 {

    public int numberOfViolations(int [] arr){
        return numberOfViolations(arr, 0, arr.length-1, 0);
    }

    private int numberOfViolations(int [] arr, int start, int end, int violation){
        if(start<end){
            for(int i = end-1; i>=start; i--)
                if(arr[end]<arr[i]) violation++;
            return numberOfViolations(arr, start, end-1, violation);
        }
        else return violation;
    }

    public static void main(String[] args) {
        int [] arr = new int[50];
        for(int i = 0; i<50; i++){
            arr[i] = (int) (Math.random()*(100+1));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("\n\n\nNumber of violations are " + new Question1().numberOfViolations(arr));
    }
}
