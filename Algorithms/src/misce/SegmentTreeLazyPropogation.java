package misce;

public class SegmentTreeLazyPropogation {

    private final int [] st;
    private final int n;
    private final int [] nums;
    private final int [] lazy;

    SegmentTreeLazyPropogation(int [] nums){
        this.nums = nums;
        this.n = nums.length;
        int power = (int)Math.ceil(Math.log(nums.length)/Math.log(2));
        int size = 2*(int)Math.pow(2, power) - 1;
        this.st = new int[size];
        this.lazy = new int[size];
        buildTree(0, n-1, 0);
    }

    public void update(int left, int right, int val) {
        update(left, right, val, 0, n-1, 0);
    }

    public int sumRange(int left, int right) {
        return sumRange(left, right, 0, n-1, 0);
    }

    private void update(int qLeft, int qRight, int diff, int left, int right, int index){
        if(lazy[index]!=0){
            st[index] = (right-left+1)*lazy[index];
            if(left!=right){
                lazy[index*2+1] += lazy[index];
                lazy[index*2+2] += lazy[index];
            }
            lazy[index] = 0;
        }
        if(left>right || left>qRight || right<qLeft)    return;
        if(left>=qLeft && right<=qRight){
            st[index] += (right-left+1)*diff;
            if(left!=right){
                lazy[index*2+1] += diff;
                lazy[index*2+2] += diff;
            }
            return;
        }
        int mid = left + (right-left)/2;
        update(qLeft, qRight, diff, left, mid, 2*index+1);
        update(qLeft, qRight, diff, mid+1, right, 2*index+2);
        st[index] = st[2*index+1] + st[2*index+2];
    }

    private int sumRange(int qLeft, int qRight, int left, int right, int index) {
        if(left>=qLeft && right<=qRight)    return st[index];
        if(right<qLeft || left>qRight)  return 0;
        int mid = left + (right-left)/2;
        return sumRange(qLeft, qRight, left, mid, 2*index+1) + sumRange(qLeft, qRight, mid+1, right, 2*index+2);
    }

    private int buildTree(int left, int right, int index){
        if(left==right){
            st[index] = nums[left];
        }
        if(left>right)  return 0;
        int mid = left + (right-left)/2;
        st[index] = buildTree(left, mid, 2*index+1)+buildTree(mid+1, right, 2*index+2);
        return st[index];
    }

}
