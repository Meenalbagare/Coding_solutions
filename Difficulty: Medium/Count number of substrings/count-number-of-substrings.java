//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long count(String s,int k){
        if(s.length()==0) return 0;
        Map<Character,Long> m=new HashMap<>();
        long left=0,num=0;
        for(long i=0;i<s.length();i++){
            m.put(s.charAt((int)i),m.getOrDefault(s.charAt((int)i),0L)+1);
            
            while(m.size()>k){
                m.put(s.charAt((int)left),m.getOrDefault(s.charAt((int)left),0L)-1);
                if(m.get(s.charAt((int)left))==0){
                    m.remove(s.charAt((int)left));
                }
                left++;
            }
            
            num+=i-left+1;
        }
        return num;
    }
    long substrCount (String S, int K) {
        // your code here
        return count(S,K)-count(S,K-1);
    }
}