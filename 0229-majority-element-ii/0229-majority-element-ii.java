class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
           // if(map.containsKey(nums[i])){
           //     map.put(nums[i],map.get(nums[i])+1);
           // } else{
           //     map.put(nums[i],1);
           // }
        }
        int n=nums.length;
        // Set<Integer> keySet=map.keySet();
        for(Integer key:map.keySet()){
            if(map.get(key)>n/3){
                res.add(key);
            }
        }
        return res;
        
    }
}