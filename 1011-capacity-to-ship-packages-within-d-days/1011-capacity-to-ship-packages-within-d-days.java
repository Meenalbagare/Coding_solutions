class Solution {
    public int maxele(int[] weights){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>=maxi){
                maxi=weights[i];
            }
        }
        return maxi;
    }
    public int summ(int[] weights){
        int s=0;
        for(int i=0;i<weights.length;i++){
            s+=weights[i];
        }
        return s;
    }
    public int iswt(int[] weights,int cap){
        int load=0;
        int days=1;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                days+=1;
                load=weights[i];
            } else{
                load+=weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=maxele(weights);
        int h=summ(weights);
        while(l<=h){
            int mid=(l+h)/2;
            if(iswt(weights,mid)<=days){
                h=mid-1;
            } else{
                l=mid+1;
            }
        }
        return l;
    }
}