package check;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] s = new long[n];
        long [] a = new long[n];
        for(int i = 0; i<n; i++){
            s[i] = scan.nextLong();
        }
        for(int i = 0; i<n; i++){
            a[i] = scan.nextLong();
        }
        System.out.println(helper(s, a, n));
    }
    public static long helper(long[] nums1, long[] nums2, int n) {
        int mask = 1<<n;
        long [][] dp = new long[n][mask];
        long MAX = 1000000000000000L;
        Arrays.fill(dp[0], MAX);
        for(int i = 0; i<n; i++){
            dp[0][1<<i] = cost(nums1[0], nums2[i]);
        }
        for(int i = 1; i<n; i++){
            for(int j = 1; j<mask; j++){
                dp[i][j] = MAX;
                for(int k = 0; k<n; k++){
                    if(((1<<k)&j)!=0)   dp[i][j] = Math.min(dp[i][j], cost(nums1[i], nums2[k])+dp[i-1][(1<<k)^j]);
                }
            }
        }
        return dp[n-1][mask-1];
    }

    public static long cost(long n1, long n2){
        long gcd = gcd(n1, n2);
        long lcm = (n1*n2)/gcd;
        return lcm^gcd;
    }

    public static long gcd(long a, long b)  {
        if (b == 0)     return a;
        return gcd(b, a % b);
    }
}