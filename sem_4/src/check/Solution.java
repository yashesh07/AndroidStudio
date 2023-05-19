package check;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long p = scan.nextInt();
        long q = scan.nextInt();
        long r = scan.nextInt();

        long [] arr = new long[n];

        for(int i = 0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(arr[i]<min)  min = arr[i];
            if(arr[i]>max)  max = arr[i];
        }

        long result = (p<0?p*min:p*max) + (q<0?q*min:q*max) + (r<0?r*min:r*max);

        System.out.println(result);
    }
}
