class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        l1=len(s)
        l2=len(t)
        i=0
        j=0
        flag=[]
        while(j<l2 and i<l1):
            if (s[i] == t[j]):
                flag.append(True)
                i+=1
                j+=1
            else:
                j+=1
        if len(flag)==l1:
            return True
        else:
            return False