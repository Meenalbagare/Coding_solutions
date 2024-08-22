class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        new1=set(nums)
        # print(new)
        new=list(sorted(new1))
        # print(new)
        n=len(new)
        if(n>=3):
            return new[n-3]
        else:
            return new[n-1]