class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        maxwater=0
        while(l<r):
            waterlevel=min(height[l],height[r])
            width=r-l
            maxwater=max(maxwater,(waterlevel*width))
            if(height[l]<height[r]):
                l+=1
            else:
                r-=1
        return maxwater;