package Math;

import java.math.BigInteger;

public class Math {
    public int gcd(int a, int b)  {
        if (b == 0)     return a;
        return gcd(b, a % b);
    }

    public long nCr(int n, int r) {
        long p = 1, k = 1;
        if (n - r < r) {
            r = n - r;
        }
        if (r != 0) {
            while (r > 0) {
                p *= n;
                k *= r;
                long m = __gcd(p, k);
                p /= m;
                k /= m;
                n--;
                r--;
            }
        }
        else {
            p = 1;
        }
        return p;
    }

    public long __gcd(long n1, long n2) {
        long gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public BigInteger factorial(int N) {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= N; i++)    f = f.multiply(BigInteger.valueOf(i));
        return f;
    }

    public int power(int x, int y, int p) {
        int res = 1;
        while (y > 0) {
            if ((y & 1) != 0)   res = res * x;
            y = y >> 1;
            x = x * x;
        }
        return res % p;
    }

    public boolean [] sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++)   prime[i] = true;
        for(int p = 2; p*p <=n; p++) {
            if(prime[p] == true) {
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        return prime;
    }
}
