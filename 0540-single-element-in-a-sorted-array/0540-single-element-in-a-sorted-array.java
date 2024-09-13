class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            } else{
                map.put(nums[i],1);
            }
        }
        Set<Integer> keys=map.keySet();
        for(Integer i:keys){
            if(map.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}