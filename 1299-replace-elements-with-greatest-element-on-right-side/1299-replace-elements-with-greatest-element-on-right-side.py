class Solution(object):
    def replaceElements(self, arr):
        """
        :type arr: List[int]
        :rtype: List[int]
        """
        
#         for i in range(len(arr)-1):
#             j=i+1
#             maxi=arr[j]
#             for k in range(j+1,len(arr)):
#                 if arr[k]>=maxi:
#                     maxi=arr[k]
#             arr[i]=maxi
#         arr[len(arr)-1]=-1
#         return arr
                
        m = -1
        for i in range(len(arr)-1,-1,-1):
            if arr[i]>m :
                m, arr[i] = arr[i], m
            else:
                arr[i] = m
        return arr