class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> count=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        int[] freq=new int[nums.length+1];
        for (int i:nums){
            count.put(i,count.getOrDefault(0,i)+1);
            freq[i]++;
        }
        for (int i=0;i<freq.length;i++){
            if(freq[i]>1){
                res.add(i);
            }
        }
        return res;
    }
}