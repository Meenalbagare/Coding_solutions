//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int ans = new Solution().rowWithMax1s(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int lower(int a[],int x){
        int i=0;
        int j=a.length-1;
        int ans=a.length;
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]>=x){
                ans=mid;
                j=mid-1;
            } else{
                i=mid+1;
            }
        }
        return ans;
    }
    public int rowWithMax1s(int arr[][]) {
        // code here
        int c_max=0;
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            int c_ones=arr[0].length-lower(arr[i],1);
            if(c_ones>c_max){
                c_max=c_ones;
                idx=i;
            }
        }
        return idx;
    }
}