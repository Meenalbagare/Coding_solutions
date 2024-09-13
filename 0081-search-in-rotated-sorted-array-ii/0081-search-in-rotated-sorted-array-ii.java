class Solution {
    public boolean search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        return searching(nums,target,s,e);
    }
    public boolean searching(int[] nums,int target,int s,int e){
        if(s>e) return false;
        int mid=(s+e)/2;
        if(target==nums[mid]) return true;
        if(nums[s]==nums[mid] && nums[mid]==nums[e]){
            s++;
            e--;
            return searching(nums,target,s,e);
        }
        if(nums[s]<=nums[mid]){
            if(nums[s]<=target && target<=nums[mid]){
                return searching(nums,target,s,mid-1);
            } else{
                return searching(nums,target,mid+1,e);
            }
        }
        else{
            if(nums[mid]<=target && target<=nums[e]){
                return searching(nums,target,mid+1,e);
            } else{
                return searching(nums,target,s,mid-1);
            }
        }
        
    }
}