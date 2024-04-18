class Solution {
public:
    int islandPerimeter(vector<vector<int>>& grid) {
        int n=grid.size();
        int m=grid[0].size();
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if((i>0 && grid[i-1][j]==0) || i==0){
                        c++;
                    }
                    if((j>0 && grid[i][j-1]==0) || j==0){
                        c++;
                    }
                    if((i<n-1 && grid[i+1][j]==0) || i==n-1){
                        c++;
                    }
                    if((j<m-1 && grid[i][j+1]==0) || j==m-1){
                        c++;
                    }
                }
            }
        }
        return c;
    }
};