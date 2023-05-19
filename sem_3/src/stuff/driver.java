package stuff;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 1; i<=T; i++){
            int N = scan.nextInt();
            int K = scan.nextInt();
            int maxRem = 0;
            for(int j = 1; j<=K; j++){
                int rem = N % K;
                if(rem>maxRem)  maxRem = rem;
            }
            System.out.println(maxRem);
        }
    }
}
