class Solution:
    def isPalindrome(self, x: int) -> bool:
        s=0
        temp=x
        while(x>0):
            r=x%10
            s=(s*10)+r
            x=x//10
        
        if(temp==s):
            return True
        else:
            return False