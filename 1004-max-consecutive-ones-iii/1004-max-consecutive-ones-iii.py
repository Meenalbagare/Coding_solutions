class Solution(object):
    def longestOnes(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        i=0
        res=0
        zerocount=0
        for j in range(len(nums)):
            if nums[j]==0:
                zerocount+=1
            while(zerocount > k):
                if nums[i]==0:
                    zerocount-=1
                i+=1
            res=max(res,j-i+1)
        return res
            
                
        