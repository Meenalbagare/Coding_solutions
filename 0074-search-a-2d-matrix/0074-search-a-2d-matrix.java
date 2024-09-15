class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int h=(m*n-1);
        while(l<=h){
            int mid=(l+h)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) l=mid+1;
            else h=mid-1;
        }
        return false;
    }
}