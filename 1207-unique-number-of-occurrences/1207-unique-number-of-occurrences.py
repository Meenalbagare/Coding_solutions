class Solution(object):
    def uniqueOccurrences(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        b=[]
        d={}
        for i in arr:
            if i not in d:
                d[i]=1
            else:
                d[i]+=1
        for i in d.keys():
            b.append(d[i])
        if len(set(b))==len(b):
            return True
        return False
            
        