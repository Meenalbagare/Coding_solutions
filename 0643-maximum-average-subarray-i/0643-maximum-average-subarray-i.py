class Solution(object):
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
#         s=0
#         maxi=0
#         if len(nums)==1:
#             return nums[0]
#         for i in range(len(nums)-k+1):
#             for j in range(i,k+i):
#                 s+=nums[j]
#                 #print(i,j,s)
#             #print(i,s)
#             a=s/float(k)
#             s=0
#             #print(i,a)
#             maxi=max(maxi,a)
        
#         return maxi

        s = sum(nums[:k])  # Calculate the sum of the first k elements.
        maxi = s / float(k)  # Initialize the maximum average.

        for i in range(k, len(nums)):
            s += nums[i] - nums[i - k]  # Update the sum for the sliding window.
            maxi = max(maxi, s / float(k))  # Update the maximum average.

        return maxi