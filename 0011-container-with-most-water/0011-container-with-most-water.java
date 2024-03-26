class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxwater=0;
        while(l<r){
            int waterlevel=Math.min(height[l],height[r]);
            int width=r-l;
            maxwater=Math.max(maxwater,(waterlevel*width));
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxwater;
    }
}