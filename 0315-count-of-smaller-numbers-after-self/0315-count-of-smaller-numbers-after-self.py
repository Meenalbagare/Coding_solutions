from sortedcontainers import SortedList
class Solution:
    def countSmaller(self, nums: List[int]) -> List[int]:
        res=[]
        sorted_arr=SortedList([])
        
        for i in range(len(nums)-1,-1,-1):
            
            num=nums[i]
            idx=sorted_arr.bisect_left(num)
            res.append(idx)
            sorted_arr.add(num)
        return res[::-1]