class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> x= new HashSet<>();
        for(int i:nums1){
            x.add(i);
        }
        
        HashSet<Integer> y=new HashSet<>();
        for(int j:nums2){
            y.add(j);
        }
        x.retainAll(y);
        int idx=0;
        int[] res=new int[x.size()];
        for(int i:x){
            res[idx++]=i;
        }
        return res;
    }
}




