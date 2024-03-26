class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res=[]
        nums.sort()
        for i, val in enumerate(nums):
            if (i>0 and val==nums[i-1]):
                continue
            l=i+1
            r=len(nums)-1
            while l<r:
                summ=val+nums[l]+nums[r]
                if(summ>0):
                    r-=1
                elif (summ<0):
                    l+=1
                else:
                    res.append([val,nums[l],nums[r]])
                    l+=1
                    while(l<r and nums[l]==nums[l-1]):
                        l+=1
        return res