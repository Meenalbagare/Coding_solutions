class Solution {
    public int joseph(List<Integer> f,int idx, int k){
        if(f.size()==1){
            return f.get(0);
        }
        idx=((idx+k)%f.size());
        f.remove(f.get(idx));
        return joseph(f,idx,k);
    }
    public int findTheWinner(int n, int k) {
        List<Integer> friends=new ArrayList<>();
        k--;
        for(int i=1;i<=n;i++){
            friends.add(i);
        }
        return joseph(friends,0,k);
    }
}