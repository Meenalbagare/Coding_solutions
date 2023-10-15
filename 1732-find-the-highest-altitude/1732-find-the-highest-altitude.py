class Solution(object):
    def largestAltitude(self, gain):
        """
        :type gain: List[int]
        :rtype: int
        """
        cur=0
        maxi=0
        for i in gain:
            cur+=i
            maxi=max(maxi,cur)
        return maxi
        