//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class gfg {

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String s[] = read.readLine().trim().split("\\s+");

            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);

            int arr[] = new int[n];

            String st[] = read.readLine().trim().split("\\s+");

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st[i]);
            }

            Solution obj = new Solution();

            System.out.println(obj.searchInSorted(arr, n, k));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int searchInSorted(int arr[], int N, int K) {

        // Your code here
        int l=0;
        int h=N-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(K==arr[mid]){
                return 1;
            }
            else if(K<arr[mid]){
                h=mid-1;
            } else{
                l=mid+1;
            }
        }
        return -1;
    }
}