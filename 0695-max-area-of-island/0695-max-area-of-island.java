class Solution {
    public int dfs(int[][] grid,int i, int j, int t){
        int n=grid.length;
        int m=grid[0].length;
        if (i>=0 && i<n && j>=0 && j<m && grid[i][j]==1){
            grid[i][j]=0;
            return (1+dfs(grid,i-1,j,t)+dfs(grid,i,j-1,t)+dfs(grid,i+1,j,t)+dfs(grid,i,j+1,t));
        }
        return 0;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int t=0;
                    ans=Math.max(ans,dfs(grid,i,j,t));
                }
            }
        }
        return ans;
    }
}