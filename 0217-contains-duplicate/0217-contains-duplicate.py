class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
         # s=set(nums)
         # if len(nums)==len(s):
         #     return False
         # return True

        # d=[]
        # for i in range(len(nums)):
        #     if nums[i] in d:
        #         return True
        #     else:
        #         d.append(nums[i])
        # return False
        
        s=set(nums)
        if len(s)<len(nums):
            return True
        return False
            
        
            