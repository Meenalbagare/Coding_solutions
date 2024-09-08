class Solution {
    public int maxFrequency(int[] nums, int k) {
        int st=0;
        int e=0;
        long s=0;
        int res=1;
        Arrays.sort(nums);
        while(e<nums.length){
            s+=nums[e++];
            if(k+s<((long)nums[e-1]*(e-st))){
                s-=nums[st++];
            }
            res=Math.max(res,(e-st));
               
        }
        return res;      
    }
}