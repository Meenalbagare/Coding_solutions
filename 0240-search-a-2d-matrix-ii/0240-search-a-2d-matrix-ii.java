class Solution {
    public boolean bs(int[] matrix,int target){
        int l=0;
        int h=matrix.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(matrix[mid]==target) return true;
            else if(matrix[mid]>target) h=mid-1;
            else l=mid+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        // int l=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int h=(n*m)-1;
        for(int i=0;i<n;i++){
            boolean flag=bs(matrix[i],target);
            if(flag==true) return true;
        }
        return false;
    }
}