class Solution(object):
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        lsum=0
        total=sum(nums)
        for i in range(len(nums)):
            rsum=total-lsum-nums[i]
            if lsum==rsum:
                return i
            lsum+=nums[i]
        return -1