import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = scan.nextInt();
        System.out.println(Math.min(emptyArray(arr.clone(), 0, arr.length-1, 0), emptyArray(arr.clone(), 0, arr.length-1, 1)));
    }

    public static int emptyArray(int [] arr, int left, int right, int start){
        if(left<=right){
            if(arr[left]==0){
                left++;
                return Math.min(emptyArray(arr.clone(), left, right, 0), emptyArray(arr.clone(), left, right, 1));
            }
            else if(arr[right]==0){
                right--;
                return Math.min(emptyArray(arr.clone(), left, right, 0), emptyArray(arr.clone(), left, right, 1));
            }
            else if(arr[left]==arr[right]){
                int cost = F(arr[left])*arr[right];
                arr[left] = D(arr[left]);
                arr[right] = D(arr[right]);
                return cost + Math.min(emptyArray(arr.clone(), left, right, 0), emptyArray(arr.clone(), left, right, 1));
            }
            else if(start==0){
                int cost = F(arr[left])*arr[left];
                arr[left] = D(arr[left]);
                return cost + Math.min(emptyArray(arr.clone(), left, right, 0), emptyArray(arr.clone(), left, right, 1));
            }
            else{
                int cost = F(arr[right])*arr[right];
                arr[right] = D(arr[right]);
                return cost + Math.min(emptyArray(arr.clone(), left, right, 0), emptyArray(arr.clone(), left, right, 1));
            }
        }
        return 0;
    }

    public static int F(int x){
       int numberOfPrimeFactors = 0;
       if(x==1) return 0;
       for(int i = 2; i<=x; i++){
           if(x%i==0){
               boolean check = true;
               for(int j = 2; j<i; j++)
                   if(i%j==0)   check = false;
               if(check)    numberOfPrimeFactors++;
           }
       }
       return numberOfPrimeFactors;
    }

    public static int D(int x){
        return (int) Math.floor(x/2);
    }
}
