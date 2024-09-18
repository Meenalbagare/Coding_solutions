class Solution {
    public String longestPalindrome(String s) {
        int maxlen=1;
        int start=0;
        int n=s.length();
        if(n==0) return "";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=1;j++){
                int l=i;
                int h=i+j;
                while(l>=0 && h<n && s.charAt(l)==s.charAt(h)){
                    int currlen=h-l+1;
                    if(currlen>maxlen){
                        maxlen=currlen;
                        start=l;
                    }
                    l--;
                    h++;
                }
                
                
            }
        }
        return s.substring(start,start+maxlen);
    }
}