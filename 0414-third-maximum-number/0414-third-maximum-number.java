class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> new1=new HashSet<>();
        for(int num:nums){
            new1.add(num);
        }
        List<Integer> x=new ArrayList<>(new1);
        Collections.sort(x);
        
        int n=x.size();
        if(n>=3){
            return x.get(n-3);
        }
        return x.get(n-1);
    }
}