class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return false;
        }
        int l=0;
        int r=s.length()-1;
        while(l<r){
            char f=s.charAt(l);
            char la=s.charAt(r);
            if(!Character.isLetterOrDigit(f)){
                l++;;
            }
            else if(!Character.isLetterOrDigit(la)){
                r--;
            }
            else{
                if(Character.toLowerCase(f) != Character.toLowerCase(la)){
                    return false;
                }
                else{
                    l++;
                    r--;
                }
            }
            
            
        }
        return true;
    }
}
