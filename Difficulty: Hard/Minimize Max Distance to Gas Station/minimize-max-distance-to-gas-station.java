//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            Solution obj = new Solution();
            double ans = obj.findSmallestMaxDist(a, k);
            System.out.printf("%.2f", ans);
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // public static int numberOfGasStationsRequired(double dist, int[] arr) {
    //     int n = arr.length; // size of the array
    //     int cnt = 0;
    //     for (int i = 1; i < n; i++) {
    //         int numberInBetween = (int)((arr[i] - arr[i - 1]) / dist);
    //         if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
    //             numberInBetween--;
    //         }
    //         cnt += numberInBetween;
    //     }
    //     return cnt;
    // }

    // public static double findSmallestMaxDist(int[] arr, int k) {
    //     int n = arr.length; // size of the array
    //     double low = 0;
    //     double high = 0;

    //     //Find the maximum distance:
    //     for (int i = 0; i < n - 1; i++) {
    //         high = Math.max(high, (double)(arr[i + 1] - arr[i]));
    //     }

    //     //Apply Binary search:
    //     double diff = 1e-6 ;
    //     while (high - low > diff) {
    //         double mid = (low + high) / (2.0);
    //         int cnt = numberOfGasStationsRequired(mid, arr);
    //         if (cnt > k) {
    //             low = mid;
    //         } else {
    //             high = mid;
    //         }
    //     }
    //     return high;
    // }

    public static int f(int a[],double k){
        int c=0;
        for(int i=1;i<a.length;i++){
            int between=(int) ((a[i]-a[i-1])/k);
            if((a[i]-a[i-1])==(between*k)) between--;
            c+=between;
        }
        return c;
    }
    public static double findSmallestMaxDist(int stations[], int k) {
        // code here
        double l=0;
        double h=0;
        for(int i=0;i<stations.length-1;i++){
            h=Math.max(h,(double)(stations[i+1]-stations[i]));
        }
        while(h-l>1e-6){
            double mid=(l+h)/2.0;
            int totaldis=f(stations,mid);
            if(totaldis>k) l=mid;
            else h=mid;
        }
        return h;
    }
    
}
