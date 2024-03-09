class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int l=0,r=0;
        int l1=nums1.length;
        int l2=nums2.length;
        while (l<l1 && r<l2){
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
}