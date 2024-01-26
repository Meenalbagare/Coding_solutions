class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l+=1;
            r-=1;
        }
        
        l=0;
        r=k-1;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l+=1;
            r-=1;
        }
        
        l=k;
        r=nums.length-1;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l+=1;
            r-=1;
        }
    }
}