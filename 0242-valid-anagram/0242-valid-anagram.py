class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s)!=len(t):
            return False
        counter1,counter2={},{}
        for i in range(len(s)):
            counter1[s[i]]=1+counter1.get(s[i],0)
            counter2[t[i]]=1+counter2.get(t[i],0)
        for i in counter1:
            if counter1[i]!=counter2.get(i,0):
                return False
        return True
        