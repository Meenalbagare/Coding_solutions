class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        for i in range(len(nums)):
            j=i+1
            while(nums[i]==0 and j<len(nums)):
                if(nums[j]!=0):
                    temp=nums[j]
                    nums[j]=nums[i]
                    nums[i]=temp
                else:
                    j+=1
        