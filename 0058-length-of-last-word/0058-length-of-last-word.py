class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        c=0
        
        for i in range(len(s)-1,-1,-1):
            if(s[i]!=' '):
                c+=1
            else:
                if(c>0):
                    return c
        return c
            
        
  