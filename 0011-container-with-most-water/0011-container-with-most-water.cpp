class Solution {
public:
    int maxArea(vector<int>& height) {
        int l=0;
        int r=height.size()-1;
        int maxwater=0;
        while(l<r){
            int waterlevel=min(height[l],height[r]);
            int width=r-l;
            maxwater=max(maxwater,(width*waterlevel));
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxwater;
    }
};