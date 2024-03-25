class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        count={}
        res=[]
        freq=[0 for i in range(len(nums)+1)]
        for i in nums:
            count[i]=count.get(i,0)+1
            freq[i]+=1
        for i in range(len(freq)):
            if freq[i]>1:
                res.append(i)
        return res
        