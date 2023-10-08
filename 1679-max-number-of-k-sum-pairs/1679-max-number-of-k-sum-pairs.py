class Solution(object):
    def maxOperations(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        pair = defaultdict(int) # integer 0 is the default value of all the keys
        res = 0
        
        for n in nums:
            if pair[n]: # if we encountered k - n already
                res += 1
                pair[n] -= 1
            else: # if we did'n find a pair yet
                pair[k - n] += 1
                
        return res
                
                
                