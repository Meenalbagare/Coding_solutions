class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res=[]
        subset=[]
        def backtrack(i,target):
            if(i==len(candidates)):
                if(target==0):
                    res.append(subset.copy())
                return
            if(candidates[i]<=target):
                subset.append(candidates[i])
                backtrack(i,target-candidates[i])
                subset.pop()
                
            
            backtrack(i+1,target)
        backtrack(0,target)
        return res