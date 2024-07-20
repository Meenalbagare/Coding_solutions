class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        def backtrack(s,path):
            res.append(path)
            for i in range(s,len(nums)):
                backtrack(i+1,path+[nums[i]])
        res=[]
        backtrack(0,[])
        return res