class Solution {
    public boolean isPalindrome(String s){
        int l=0,r=s.length()-1;
        while(l<r && s.charAt(l)==s.charAt(r)){
            l++;
            r--;
        }
        return l>=r;
    }
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            String sub="";
            for(int j=i;j<s.length();j++){
                sub+=s.charAt(j);
                // System.out.println(sub);
                if(isPalindrome(sub)){
                    c+=1;
                }
            }
        }
        return c;
    }
}