class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        summ=0
        nums.sort()
        for i in range(len(nums)):
            summ+=nums[i]
        
        for i in range(len(nums)-1,-1,-1):
            summ-=nums[i]
            if(summ>nums[i]):
                return summ+nums[i]
        return -1
    
 