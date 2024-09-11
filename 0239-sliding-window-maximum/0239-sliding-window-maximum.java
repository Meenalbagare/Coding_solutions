class Solution {
    static class Pair implements Comparable<Pair>{
        int no;
        int idx;
        public Pair(int no,int idx){
            this.no=no;
            this.idx=idx;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.no-this.no;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int n=nums.length;
        int[] res=new int[n-k+1];
        for(int i=0;i<k;i++){
            pq.add(new Pair(nums[i],i));
        }
        
        res[0]=pq.peek().no;
        for(int i=k;i<nums.length;i++){
            while(pq.size()>0 && pq.peek().idx<=(i-k)){
                pq.remove();
            }
            pq.add(new Pair(nums[i],i));
            res[i-k+1]=pq.peek().no;
        }
        return res;
    }
}