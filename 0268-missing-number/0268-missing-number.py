class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        v=[-1]*(len(nums)+1)
        for i in nums:
            v[i]=i
        for j in range(len(v)):
            if v[j]==-1:
                return j
        return 0
#         n=len(nums)
#         for i in range(n+1):
#             if i not in nums:
#                 return i
            
            
            