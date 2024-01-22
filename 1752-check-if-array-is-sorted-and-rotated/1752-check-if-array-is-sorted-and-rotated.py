class Solution:
    def check(self, nums: List[int]) -> bool:
        op = 0
        for i in range(len(nums)):
            if nums[(i+1)%(len(nums))] >= nums[i]: 
                pass
            else:
                op += 1
                if op > 1:
                    return False
        else:
            return True