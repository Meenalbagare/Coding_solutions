class NumArray {
    private ArrayList<Integer> prefix;
    public NumArray(int[] nums) {
        prefix= new ArrayList<>();
        int c=0;
        for(int i:nums){
            c+=i;
            prefix.add(c);
        }
    }
    
    public int sumRange(int left, int right) {
        int rSum=prefix.get(right);
        int lSum= (left>0)? prefix.get(left-1): 0;
        return rSum-lSum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */