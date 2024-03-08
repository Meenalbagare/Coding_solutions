class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> hash=new HashMap<>();
        int c=0;
        int maxi=0;
        for(int i:nums){
            hash.put(i,hash.getOrDefault(i,0)+1);
            maxi=Math.max(maxi,hash.get(i));
        }
        for(int j:hash.values()){
            if(j==maxi){
                c+=j;
            }
        }
        return c;
    }
}

