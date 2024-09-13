class Solution {
    public int searching(int[] nums,int target,int l, int r){
        if(l>r) return -1;
        int mid=(l+r)/2;
        if(target==nums[mid]){
            return mid;
        } 
        else if(target>nums[mid]){
            return searching(nums,target,mid+1,r);}
        // } else if(target<nums[mid]){
        //     return searching(nums,target,l,mid-1);
        // }
            else{return searching(nums,target,l,mid-1);}
        // return -1;
    }
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        return searching(nums,target,l,r);
    }
}