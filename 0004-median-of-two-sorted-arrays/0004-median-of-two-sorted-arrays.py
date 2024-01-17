class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        i,j=0,0
        res=[]
        while i<len(nums1) and j<len(nums2):
            if nums1[i]<nums2[j]:
                res.append(nums1[i])
                i+=1
            else:
                res.append(nums2[j])
                j+=1
        if i<len(nums1):
            for k in range(i,len(nums1)):
                res.append(nums1[k])
        if j<len(nums2):
            for k in range(j,len(nums2)):
                res.append(nums2[k])
        print(res)
        n=len(res)
        
        if(n%2==1):
            return (res[n//2])
        else:
            s=res[((n-1)//2)]
            y=res[(n//2)]
            return ((s+y)/2)
                
                