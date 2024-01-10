class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        num=x
        rev=0
        while(x>0):
            lastDigit=x%10
            rev=rev*10+lastDigit
            x=x//10
        if(rev==num):
            return True
        else:
            return False