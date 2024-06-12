class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
     
        count=[0]*3
        for j in nums:
            count[j]+=1
        i=0
        for key,value in enumerate(count):
            for k in range(value):
                nums[i]=key
                i+=1
        