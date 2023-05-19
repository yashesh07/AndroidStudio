package lab_3;

public class fgad {
        public static int NoOfCoins(int [] arr, int act){
            return NoOfCoins(arr, act, 0);
        }

        private static int NoOfCoins(int[] arr, int act, int first){
            if(act==0)
                return 0;
            else{
                int[] res = new int[arr.length];
                for(int i = 0; i< res.length; i++)
                    res[i] = -1;
                for(int i = first; i<arr.length; i++){
                    if(arr[i]>0 && arr[i]<=act){
                        int res2 = NoOfCoins(arr, act-arr[i], i);
                        if(res2!=-1)  res[i] = res2;
                    }
                }
                return  findMin(res);
            }
        }


        private static int findMin(int[] mini){
            int min = Integer.MAX_VALUE;
            for(int i = 0; i<mini.length; i++)
                if(mini[i]>=0 && mini[i]<min) min = mini[i];
            if(min==Integer.MAX_VALUE)  return -1;
            else return min;
        }

        public static void main(String[] args) {
            int[] coins = {1, 2, 3, 5, 10, 20};
            System.out.println(NoOfCoins(coins, 36));
        }


}
