package misce;

public class SegmentTree {

    private final int [] st;
    private final int n;
    private final int [] nums;

    public SegmentTree(int[] nums) {
        this.nums = nums;
        this.n = nums.length;
        int power = (int)Math.ceil(Math.log(nums.length)/Math.log(2));
        int size = 2*(int)Math.pow(2, power) - 1;
        this.st = new int[size];
        buildTree(0, n-1, 0);
    }

    public void update(int index, int val) {
        update(index, val-nums[index], 0, n-1, 0);
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        return sumRange(left, right, 0, n-1, 0);
    }

    private int sumRange(int qLeft, int qRight, int left, int right, int index) {
        if(left>=qLeft && right<=qRight)    return st[index];
        if(right<qLeft || left>qRight)  return 0;
        int mid = left + (right-left)/2;
        return sumRange(qLeft, qRight, left, mid, 2*index+1) + sumRange(qLeft, qRight, mid+1, right, 2*index+2);
    }

    private void update(int q, int diff, int left, int right, int index){
        if(q<left || q>right)   return;
        st[index] += diff;
        if(left==right) return;
        int mid = left + (right-left)/2;
        update(q, diff, left, mid, 2*index+1);
        update(q, diff, mid+1, right, 2*index+2);
    }

    private int buildTree(int left, int right, int index){
        if(left==right){
            st[index] = nums[left];
            return st[index];
        }
        int mid = left + (right-left)/2;
        st[index] = buildTree(left, mid, 2*index+1) + buildTree(mid+1, right, 2*index+2);
        return st[index];
    }
}