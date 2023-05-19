package check;

public class PaintersProblem {
    int k;
    int [] boards;
    int lenToCover;
    int ans = -1;

    PaintersProblem(int k, int [] boards){
        this.k = k;
        this.boards = boards;
        int sum = 0;
        for(int i : boards) sum+=i;
        this.lenToCover = sum/k;
        int maxLen = 0;
        int len = 0;
        for (int board : boards) {
            if (len + (board / 2) <= lenToCover) {
                len += board;
            } else {
                maxLen = Math.max(maxLen, len);
                len = board;
            }
        }
        this.ans = maxLen;
    }

    public int getSolution(){
        return ans;
    }
}
