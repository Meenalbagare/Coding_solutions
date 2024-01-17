class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:      
        left=0
        right=len(nums)-1
        if target in nums:
            for i in range(0,len(nums)):
                if nums[left]==nums[right]:
                    return [left,right] 
                elif nums[left]<target:
                    left+=1
                else:
                    right-=1
        else:
            return [-1,-1]     
       

                