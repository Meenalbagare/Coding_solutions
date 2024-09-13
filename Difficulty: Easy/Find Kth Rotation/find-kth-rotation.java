//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int i=0;
        int j=arr.size()-1;
        int ans=Integer.MAX_VALUE;
        int idx=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr.get(i)<=arr.get(mid)){
                if(arr.get(i)<ans){
                    idx=i;
                    ans=arr.get(i);
                }
                
                
                i=mid+1;
            } else{
                if(arr.get(mid)<ans){
                    ans=arr.get(mid);
                    idx=mid;
                }
                j=mid-1;
               
            }
        }
        return idx;
    }
}