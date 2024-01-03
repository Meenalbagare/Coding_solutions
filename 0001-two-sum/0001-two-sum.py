class Solution(object):
    def twoSum(self, nums, target):
        d={}
        for i,val in enumerate(nums):
            if (target-val) in d:
                return (d[target-val],i)
            d[val]=i
        return []
