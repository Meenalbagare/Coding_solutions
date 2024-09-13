//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor=-1;
        int ceil=-1;
        int[] ans=new int[2];
        for(int i:arr){
            if(i<=x){
                floor=Math.max(floor,i);
            }
            if(i>=x){
                ceil=(ceil==-1)?i:Math.min(ceil,i) ;
            }
        }
        ans[0]=floor;
        ans[1]=ceil;
        return ans;
    }
}
