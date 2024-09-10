class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefsum=0;
        int c=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefsum+=nums[i];
            int removal=prefsum-k;
            c+=map.getOrDefault(removal,0);
            map.put(prefsum,map.getOrDefault(prefsum,0)+1);
        }
        return c;
    }
}