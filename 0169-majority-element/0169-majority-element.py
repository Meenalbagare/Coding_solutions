class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        c=defaultdict(int)
        margin=len(nums)/2
        for i in nums:
            c[i]+=1
        for i,j in c.items():
            if j>margin:
                return i
            
            