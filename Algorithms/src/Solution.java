import java.util.*;

public class Solution {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
//        int T = scan.nextInt();
        int T = 1;
        while(T-->0){
            solve();
        }
    }

    public static void solve(){
        long n = scan.nextLong();
        if(n<10){
            long sum = 0;
            for(int i = 1; i<=n; i++){
                if(i%2!=0)  sum += i;
                else sum -= i;
            }
            System.out.println(sum);
            return;
        }
        String str = n+"";
        long [] presum = new long[16];
        presum[0] = 0L;
        presum[1] = 5L;
        presum[2] = -45L;
        long count = 9L;
        for(int i = 3; i<16; i++){
            if(i%2!=0){
                count = count*100;
                presum[i] = 5L*count + presum[i-1];
            }
            else{
                presum[i] = presum[i-1] - (long)Math.pow(10, i-3)*45L*9L;
            }
        }
        System.out.println(Arrays.toString(presum));
        long ans = presum[str.length()-1];
        if(str.length()%2!=0){
            long temp = (long)Math.pow(10, str.length()-1) - 1L;
            long diff = n-temp;
            if(diff%2!=0){
                for(int i = 0; i<str.length()-1; i++){
                    if(i%2==0)  ans -= (long)(str.charAt(i)-'0');
                    else ans += (long)(str.charAt(i)-'0');
                }
            }
            ans += 5L*(diff/10)+altSum(diff%10);
        }
        else{
            long temp = (long)Math.pow(10, str.length()-1) - 1L;
            long diff = n-temp;
            ans += 5L*9L*(diff/10)+sumTill(diff%10);
            for(int i = 0; i<str.length()-1; i++){
                temp = (long)Math.pow(10, str.length()-1-i);
                long sum = 0L;
                long sum1 = (str.charAt(i) - '0') * (Long.parseLong(str.substring(i + 1)) % temp + 1);
                if(i%2==0){
                    sum -= sumTill((str.charAt(i)-'0')-1)*temp;
                    sum -= sum1;
                }
                else{
                    sum += sumTill((str.charAt(i)-'0')-1)*temp;
                    sum += sum1;
                }
                if(i>0) sum = sum*(Long.parseLong(str.substring(0, i)));
                ans += sum;
            }
        }
        System.out.println(ans);
    }

    public static long altSum(long n){
        long sum = 0;
        for(int i = 0; i<n; i++){
            if(i%2==0)  sum -= i;
            else sum += i;
        }
        return sum;
    }

    public static long sumTill(long n){
        return n*(n-1L)/2L;
    }
}