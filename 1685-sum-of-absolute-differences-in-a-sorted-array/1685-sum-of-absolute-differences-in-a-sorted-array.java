class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result=new int[nums.length];
        int n=nums.length;
        int totalS=0;
        for(int num:nums){
            totalS+=num;
        }
        int leftS=0;
        for(int i=0;i<n;i++){
            int rightS=totalS-leftS-nums[i];
            result[i]=nums[i]*i-leftS+rightS-nums[i]*(n-i-1);
            leftS+=nums[i];
        }
        
        return result;
//         int[] result=new int[nums.length];
        
//         for(int i=0;i<nums.length;i++){
//             int j=0;
//             while(0<=j && j<nums.length){
//                 if(j!=i){
//                     result[i]+=Math.abs(nums[i]-nums[j]);
//                 }
//                 j++;
//             }
           
//         }
//         return result;
        
    }      
}