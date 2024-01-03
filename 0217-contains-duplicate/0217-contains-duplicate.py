class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        len1=len(nums)
        if len1==len(set(nums)):
            return False
        else:
            return True