import java.util.Scanner;

public class temptemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int c = 0;
        while(t>c++) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            int s[] = new int[n];
            for (int i = 0; i < n; i++) {
                if(i == 0)
                    s[i] = sc.nextInt();
                else
                    s[i] = sc.nextInt() - s[i-1];
            }

            int tot = s[(n-1)];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt()-1;
                int r = sc.nextInt()-1;
                int x = sc.nextInt();

                int sum = s[r] - (l>=1 ?s[l-1]:0);
                // System.out.println(sum);
                sum = (r-l+1)*x - sum + tot;
                // System.out.println(sum);

                if(sum%2 == 0)
                    sb.append("NO\n");
                else
                    sb.append("YES\n");
            }
            System.out.println(sb.toString());
        }
    }

}
