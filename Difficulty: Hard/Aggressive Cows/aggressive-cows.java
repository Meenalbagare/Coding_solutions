//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static boolean place(int[] stalls,int mid,int k){
        int last=stalls[0];
        int c=1;
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last>=mid){
                c++;
                last=stalls[i];
            }
            if(c>=k) return true;
        }
        
        return false;
    }
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int l=1;
        int h=stalls[n-1]-stalls[0];
        while(l<=h){
            int mid=(l+h)/2;
            if(place(stalls,mid,k)){
                l=mid+1;
            } else{
                h=mid-1;
            }
        }
        return h;
    }
}