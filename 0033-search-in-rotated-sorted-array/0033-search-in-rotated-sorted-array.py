class Solution:
    def searchArr(self,nums: List[int], target: int,s: int,e: int) -> int:
        if(s>e):
            return -1
        mid = s+(e-s)//2
        if(target==nums[mid]):
            return mid
        if(nums[s] <= nums[mid]):
            if(nums[s] <= target and target <= nums[mid]) :
                return self.searchArr(nums,target,s,mid-1)
            else:
                return self.searchArr(nums,target,mid+1,e)
        
        else:
            if (nums[mid] <= target and target<=nums[e]):
                return self.searchArr(nums,target,mid+1,e)
            else:
                return self.searchArr(nums,target,s,mid-1)
    def search(self, nums: List[int], target: int) -> int:
        s=0
        e=len(nums)-1
        return self.searchArr(nums, target,s,e)
    
    