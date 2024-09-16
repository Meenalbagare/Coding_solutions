//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public int upper(int[] matrix,int x){
        int l=0;
        int h=matrix.length-1;
        int ans=matrix.length;
        while(l<=h){
            int mid=(l+h)/2;
            if(matrix[mid]>x){
                ans=mid;
                h=mid-1;
            } else l=mid+1;
        }
        return ans;
    }
    public int blackbox(int[][] matrix,int mid){
        int c=0;
        for(int i=0;i<matrix.length;i++){
            c+=upper(matrix[i],mid);
        }
        return c;
    }
    int median(int matrix[][], int R, int C) {
        // code here        
        int l=Integer.MAX_VALUE;
        int h=Integer.MIN_VALUE;
        for(int i=0;i<R;i++){
            l=Math.min(l,matrix[i][0]);
            h=Math.max(h,matrix[i][C-1]);
        }
        int req=(R*C)/2;
        while(l<=h){
            int mid=(l+h)/2;
            int small=blackbox(matrix,mid);
            if(small<=req) l=mid+1;
            else h=mid-1;
        }
        return l;
    }
}