class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int summ=nums[i]+nums[l]+nums[r];
                if(summ>0){
                    r--;
                }
                else if(summ<0){
                    l++;
                }
                else{
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }
                }
            }
        }
        return res;
    }
}