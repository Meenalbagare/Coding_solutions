class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        #hashset
        count=set(nums)
        for i in range(1,len(nums)+2):
            if i not in count:
                return i
        