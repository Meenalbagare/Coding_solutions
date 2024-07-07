class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        d={}
        for i in arr1:
            if i not in d:
                d[i]=1
            else:
                d[i]+=1
        ans=[]
        temp=[]
        for i in arr2:
            for j in range(d[i]):
                ans.append(i)
            d[i]=0
        for k,v in d.items():
            if v:
                for i in range(v):
                    temp.append(k)
        temp.sort()
        ans.extend(temp)
        return ans
            