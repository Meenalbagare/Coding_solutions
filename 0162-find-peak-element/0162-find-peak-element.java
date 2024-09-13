class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int i=1;
        int j=n-2;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
      if(arr[mid]>arr [mid+1]) j=mid-1;
      else i=mid+1;
        }
        return -1;
    }
}