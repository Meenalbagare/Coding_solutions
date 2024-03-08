class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        d={}
        c=0
        for i in range(len(nums)):
            if nums[i] not in d:
                d[nums[i]]=1
            else:
                d[nums[i]]+=1
        maxi=max(d.values())
        for i,j in d.items():
            if j==maxi:
                c+=j
        return c
                