class Solution {
    public int maxele(int[] a){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>=maxi){
                maxi=a[i];
            }
        }
        return maxi;
    }
    public int summ(int[] a){
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        return s;
    }
    public static int f(int[] a,int maxtime){
        int c=1;
        int totaltime=0;
        for(int i=0;i<a.length;i++){
            if(totaltime+a[i]<=maxtime){
                totaltime+=a[i];
            } else{
                c++;
                totaltime=a[i];
            }
        }
        return c;
    }
    public int splitArray(int[] nums, int k) {
        int l=maxele(nums);
        int h=summ(nums);
        if(k>nums.length) return -1;
        while(l<=h){
            int mid=(l+h)/2;
            int total=f(nums,mid);
            if(total>k){
                l=mid+1;
            } else{
                h=mid-1;
            }
        }
        return l;
    }
}