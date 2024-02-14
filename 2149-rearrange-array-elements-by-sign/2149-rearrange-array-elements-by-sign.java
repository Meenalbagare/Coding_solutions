class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        int k=0,m=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                res.add(pos.get(k));
                k++;
            }
            else{
                res.add(neg.get(m));
                m++;
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}

