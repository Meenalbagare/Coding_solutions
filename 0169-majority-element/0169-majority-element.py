class Solution {
    
    public static int counting(int[] nums,int num,int s, int e) {
        int c=0;
        for (int i=s;i<=e;i++) {
            if (nums[i] ==num){
                c++;
            }
        }
        return c;
    }
    
    public static int majorityEleRec(int[] nums,int s,int e) {
        if (s==e) {
            return nums[s];
        }
        
        int mid = s+ (e-s)/2;
        int l = majorityEleRec(nums,s,mid);
        int r = majorityEleRec(nums,mid+1,e);
        
        if (l==r) {
            return l;
        }
        
        int lcount = counting(nums,l,s,e);
        int rcount = counting(nums,r,s,e);
        
        return lcount>rcount ? l : r;
        
    }
    public int majorityElement(int[] nums) {
        return majorityEleRec(nums,0,nums.length-1);
    }
}