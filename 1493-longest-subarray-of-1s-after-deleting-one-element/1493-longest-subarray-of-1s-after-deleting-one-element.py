class Solution(object):
    def longestSubarray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i=0
        z=1
        for j in range(len(nums)):
            if nums[j]==0:
                z-=1
            if z<0:
                if nums[i]==0:
                    z+=1
                i+=1
        return j-i