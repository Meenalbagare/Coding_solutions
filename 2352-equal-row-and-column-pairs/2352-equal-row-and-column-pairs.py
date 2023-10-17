class Solution(object):
    def equalPairs(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        d=defaultdict(int)
        count=0
        for i in grid:
            d[tuple(i)]+=1
        for j in zip(*grid):
            count+=d[j]
        return count