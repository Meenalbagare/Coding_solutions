class Solution {
    public boolean check(int[] nums) {
        int pivot=0;
        boolean isIncreasing=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                pivot=i;
                isIncreasing=false;
                    break;
                
            }
        }
        if(isIncreasing){
            return true;
        }
         int n=nums.length;
        int rotation=n-pivot;
       
        int arr[]=new int[nums.length];
        for(int i=0;i<n;i++){
            arr[(i+rotation)%n]=nums[i];
        }
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}