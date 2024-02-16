from collections import Counter
class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        array=Counter(arr)
        values=list(array.values())
        values.sort()
        c=0
        for i in range(len(values)):
            if(k>values[i]):
                k-=values[i]
                values[i]=0
            else:
                values[i]-=k
                k=0
            if values[i]!=0:
                c+=1
        return c
       
          