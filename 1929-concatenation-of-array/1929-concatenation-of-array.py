class Solution(object):
    def getConcatenation(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # n=len(nums)
        # ans1=[0]*(2*n)
        # for i in range(n):
        #     ans1[i]=nums[i]
        #     ans1[i+n]=nums[i]
        # return ans1
        
        return nums+nums
            
        