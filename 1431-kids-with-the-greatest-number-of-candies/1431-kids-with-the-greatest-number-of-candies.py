class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        # maxi=max(candies)
        # for i in range(len(candies)):
        #     temp=candies[i]+extraCandies
        #     if temp>=maxi:
        #         candies[i]=True
        #     else:
        #         candies[i]=False
        # return candies
        
        res=[False for i in range(len(candies))]
        maxi=max(candies)
        for i in range(len(candies)):
            if ((candies[i]+extraCandies)>=maxi):
                
                res[i]=True
        return res