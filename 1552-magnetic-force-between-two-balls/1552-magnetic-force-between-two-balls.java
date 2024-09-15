class Solution {
    public boolean place(int[] position,int mid,int m){
        int c=1;
        int last=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-last>=mid){
                c++;
                last=position[i];
            } 
            if(c>=m) return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1;
        int n=position.length;
        int h=position[n-1]-position[0];
        while(l<=h){
            int mid=(l+h)/2;
            if(place(position,mid,m)){
                l=mid+1;
            } else{
                h=mid-1;
            }
        }
        return h;
    }
}