class Solution {
    public static boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length; // Size of the array
        int cnt = 0;
        int noOfB = 0;
        // Count the number of bouquets:
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }

    public int minDays(int[] arr, int m, int k) {
        long val = (long) m * k;
        int n = arr.length; // Size of the array
        if (val > n) return -1; // Impossible case.
        // Find maximum and minimum:
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        // Apply binary search:
        int low = mini, high = maxi;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    // public int findmin(int[] bloomDay){
    //     int mini=Integer.MAX_VALUE;
    //     for(int i=0;i<bloomDay.length;i++){
    //         if(bloomDay[i]<=mini){
    //             mini=bloomDay[i];
    //         }
    //     }
    //     return mini;
    // }
    // public int findmax(int[] bloomDay){
    //     int maxi=Integer.MIN_VALUE;
    //     for(int i=0;i<bloomDay.length;i++){
    //         if(bloomDay[i]>=maxi){
    //             maxi=bloomDay[i];
    //         }
    //     }
    //     return maxi;
    // }
    // public boolean isPossible(int[] bloomDay,int day,int m,int k){
    //     int c=0;
    //     int no=0;
    //     for(int i=0;i<bloomDay.length;i++){
    //         if(bloomDay[i]<=day){
    //             c++;
    //         } else{
    //             no+=(c/k);
    //             c=0;
    //         }
    //     }
    //     no+=(c/k);
    //     return (no>=m) ;
    // }
    // public int minDays(int[] bloomDay, int m, int k) {
    //     if(bloomDay.length<(long)(m*k)) return -1;
    //     int l=findmin(bloomDay);
    //     int h=findmax(bloomDay);
    //     int ans=h;
    //     while(l<=h){
    //         int mid=(l+h)/2;
    //         if(isPossible(bloomDay,mid,m,k)){
    //             ans=mid;
    //             h=mid-1;
    //         } else{
    //             l=mid+1;
    //         }
    //     }
    //     return ans;
    // }
}