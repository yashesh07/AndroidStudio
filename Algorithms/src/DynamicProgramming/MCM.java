package DynamicProgramming;

public class MCM {
    public int matrixMultiplication(int[] arr , int N) {
        int [][] dp = new int[N][N];
        for(int i = N-1; i>0; i--){
            for(int j = i+1; j<N; j++){
                int steps = Integer.MAX_VALUE;
                for(int k = i; k<j; k++){
                    steps = Math.min(steps, arr[i-1]*arr[k]*arr[j] + dp[i][k] + dp[k+1][j]);
                }
                dp[i][j] = steps;
            }
        }
        return dp[1][N-1];
    }
}