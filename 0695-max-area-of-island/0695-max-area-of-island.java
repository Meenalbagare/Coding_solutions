class Solution:
    def dfs(self, grid: List[List[int]], i: int, j: int) -> int:
        n, m = len(grid), len(grid[0])
        if 0 <= i < n and 0 <= j < m and grid[i][j] == 1:
            grid[i][j] = 0
            return 1 + self.dfs(grid, i + 1, j) + self.dfs(grid, i - 1, j) + self.dfs(grid, i, j + 1) + self.dfs(grid, i, j - 1)
        return 0

    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        n, m = len(grid), len(grid[0])
        max_area = 0
        for i in range(n):
            for j in range(m):
                if grid[i][j] == 1:
                    max_area = max(max_area, self.dfs(grid, i, j))
        return max_area
   
    