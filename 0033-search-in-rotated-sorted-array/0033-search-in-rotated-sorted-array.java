class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        return searchArray(nums,target,s,e);
    }
    
    public static int searchArray(int[] nums,int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(target == nums[mid]){
            return mid;
        }
        
        if (nums[s] <=nums[mid]) {
            if (nums[s] <= target && target <= nums[mid]){
                return searchArray (nums,target,s,mid-1);
            }
            else {
                return searchArray (nums,target,mid+1,e);
            }
        }
        
        else {
            if (nums[mid] <= target && target <= nums[e]) {
                return searchArray(nums,target,mid+1,e);
            }
            else {
                return searchArray (nums,target, s,mid-1);
            }
        }
    }
}