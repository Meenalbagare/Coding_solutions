class Solution:
    def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
        l=0
        r=0
        l1=len(nums1)
        l2=len(nums2)
        while (l<l1 and r<l2):
            if nums1[l]==nums2[r]:
                return nums1[l]
            elif nums1[l]<nums2[r]:
                l+=1
            else:
                r+=1
        return -1
            