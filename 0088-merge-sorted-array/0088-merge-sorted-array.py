class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i=m-1
        j=n-1
        x=m+n-1
        while(i>=0 and j>=0):
            if(nums1[i]>nums2[j]):
                nums1[x]=nums1[i]
                i-=1
                x-=1
            else:
                nums1[x]=nums2[j]
                x-=1
                j-=1
        while(j>=0):
            nums1[x]=nums2[j]
            x-=1
            j-=1
        return nums1
            
        