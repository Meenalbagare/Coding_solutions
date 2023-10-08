class Solution(object):
    def maxOperations(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        pair = defaultdict(int) 
        res = 0
        
        for n in nums:
            if pair[n]: 
                res += 1
                pair[n] -= 1
            else: 
                pair[k - n] += 1
                
        return res
                
                
                