class Solution {
    public int findMin(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[i]<=arr[mid]){
                ans=Math.min(ans,arr[i]);
                i=mid+1;
                
            } else{
                j=mid-1;
                ans=Math.min(ans,arr[mid]);
            }
        }
        return ans;
    }
}