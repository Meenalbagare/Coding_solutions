class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,r=0;
        int n=s.length();
        int maxi=0;
        int len=0;
        while(r<n){
            char c=s.charAt(r);
            if(map.containsKey(c) && map.get(c)>=l){
                
                    l=map.get(c)+1;
                
            } 
            map.put(c,r);
            len=r-l+1;
            maxi=Math.max(maxi,len);
            r++;
        }
        return maxi;
    }
}