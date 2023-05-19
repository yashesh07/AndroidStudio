/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int k = scan.nextInt();
            String str = n+"";
            Set<Character> set = new HashSet<>();
            int len = str.length();
            int i = 0;
            for(; i<n; i++){
                if(set.contains(str.charAt(i))) continue;
                if(set.size()==k)   break;
                set.add(str.charAt(i));
            }
            long ans = Long.MAX_VALUE;
            for(char c : set){
                char [] ch = new char[n-i];
                Arrays.fill(ch, c);
                long temp = Integer.parseInt(str.substring(0, i)+(new String(ch)));
                if((long)n-temp>=0)   ans = Math.min(ans, temp);
            }
            char [] ch = new char[n-i];
            Arrays.fill(ch, str.charAt(i-1));
            long temp = Integer.parseInt(str.substring(0, i)+(new String(ch)));
            if((long)n-temp>=0)   ans = Math.min(ans, temp);
            System.out.println(ans);
        }
    }
}
