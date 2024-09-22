class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        res=[]
        subset=[]
        candidates.sort()
        def backtrack(i,target):
            
            if target==0:
                res.append(subset.copy())
                return
            
            for idx in range(i,len(candidates)):
                if(idx>i and candidates[idx]==candidates[idx-1]):
                    continue
                if(candidates[idx]>target):
                    break
                subset.append(candidates[idx])
                backtrack(idx+1,target-candidates[idx])
                subset.pop()
                # backtrack(i+1,target)
        backtrack(0,target)
        return res