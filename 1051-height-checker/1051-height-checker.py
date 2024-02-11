class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        arr=sorted(heights)
        c=0
        for i in range(len(heights)):
            
            if(heights[i]!=arr[i]):
                c+=1;
        return c