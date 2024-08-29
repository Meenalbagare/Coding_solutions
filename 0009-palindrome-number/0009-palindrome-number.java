class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int s=0,r=0;
        while(x>0){
            r=x%10;
            s=(s*10)+r;
            x=x/10;
        }
        if(temp==s){
            return true;
        }
        return false;
    }
}