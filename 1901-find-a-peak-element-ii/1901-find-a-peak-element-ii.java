class Solution {
    public int maxele(int[][] mat,int mid){
        int maxi=-1;
        int idx=-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][mid]>maxi){
                maxi=mat[i][mid];
                idx=i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int l=0;
        int h=mat[0].length-1;
        int ans[]=new int[2];
        while(l<=h){
            int mid=(l+h)/2;
            int r=maxele(mat,mid);
            int left=mid-1>=0 ?mat[r][mid-1]:-1;
            int right=mid+1<mat[0].length?mat[r][mid+1]:-1;
            if(mat[r][mid]>left && mat[r][mid]>right) {
                ans[0]=r;
                ans[1]=mid;
                return ans;
            } else if(mat[r][mid]>left){
                l=mid+1;
            } else{
                h=mid-1;
            }
        }
        ans[0]=-1;
        ans[1]=-1;
        return ans;
    }
}