class Solution {
public:
    int getCommon(vector<int>& nums1, vector<int>& nums2) {
        int l=0,r=0;
        int l1=nums1.size(),l2=nums2.size();
        while(l<l1 && r<l2){
            if(nums1[l]==nums2[r]){
                return nums1[l];
            }
            else if(nums1[l]<nums2[r]){
                l++;
            }
            else{
                r++;
            }
        }
        return -1;
    }
};