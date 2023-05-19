package Crpto;

public class ShiftChipher {

    public static void main(String[] args) {
        String m = "yasheshbhavsar";
        String em = encrypt(m, 2);
        String dm = decrypt(em, 2);
        System.out.println(em);
        System.out.println(dm);
    }

    public static String encrypt(String m, int k){
        char [] ch = m.toCharArray();
        int n = ch.length;
        k %= n;
        reverse(ch, 0, n-1);
        reverse(ch, 0, k-1);
        reverse(ch, k, n-1);
        return new String(ch);
    }

    public static String decrypt(String m, int k){
        char [] ch = m.toCharArray();
        int n = ch.length;
        k %= n;
        k = n-k;
        reverse(ch, 0, n-1);
        reverse(ch, 0, k-1);
        reverse(ch, k, n-1);
        return new String(ch);
    }

    public static void reverse(char [] ch, int left, int right){
        while(left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    }
}
