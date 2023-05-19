package lab_3;

import java.util.Arrays;

public class Question2 {

    public int numberOfCoins(int [] C, int activity){
        return numberOfCoins(C, activity, 0);
    }

    private int numberOfCoins(int [] C, int activity, int start){
        if(activity==0) return 0;
        else{
            int [] result = new int[C.length];
            for(int i = 0; i< result.length; i++)
                result[i] = -1;
            for(int i = start; i<C.length; i++){
                if(C[i]<=activity && C[i]>0){
                    int rec_result = numberOfCoins(C, activity-C[i], i);
                    if(rec_result!=-1)  result[i] = 1 + rec_result;
                }
            }
            return  findMinimum(result);
        }
    }

    private int findMinimum(int [] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++)
            if(arr[i]>=0 && arr[i]<min) min = arr[i];
        if(min==Integer.MAX_VALUE)  return -1;
        else return min;
    }

    public static void main(String[] args) {
//        int [] coins = {1, 2, 3, 5, 10, 20};
//        int activity = (int) (Math.random()*(150-20+1)+20);
        int [] coins = {10, 12, 15, 30, 35};
        int activity = 350;
        System.out.println("Coins: " + Arrays.toString(coins));
        System.out.println("Activity: " + activity);
        System.out.println("\nNumber of coins: " + new Question2().numberOfCoins(coins, activity));
    }
}