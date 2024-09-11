class Solution {
    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;
        public Row(int soldiers,int idx){
            this.soldiers=soldiers;
            this.idx=idx;
        }
        @Override 
        public int compareTo(Row r2){
            if(this.soldiers==r2.soldiers){
                return this.idx-r2.idx;
            } else{
                return this.soldiers-r2.soldiers;
            }
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] res=new int[k];
        PriorityQueue<Row> pq=new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
                c+=mat[i][j]==1?1:0;
            }
            pq.add(new Row(c,i));
        }
        for(int i=0;i<k;i++){
            res[i]=pq.remove().idx;
        }
        return res;
    }
}