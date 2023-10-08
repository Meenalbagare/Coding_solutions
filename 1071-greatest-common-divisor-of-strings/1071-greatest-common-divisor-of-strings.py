class Solution(object):
    def gcdOfStrings(self, str1, str2):
        """
        :type str1: str
        :type str2: str
        :rtype: str
        """
       
            
        len1, len2 = len(str1), len(str2)
        
        def valid(i):
            if len1 % i or len2 % i: 
                return False
            return str1 == len1 // i * str1[:i] and str2 == len2 // i * str1[:i] 
        
        for i in range(min(len1, len2), 0, -1):
            if valid(i):
                return str1[:i]
        return ""
        
       