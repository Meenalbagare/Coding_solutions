import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=0){
            return intervals;
        }
        List<int[]> res=new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        res.add(new int[]{intervals[0][0],intervals[0][1]});
        for(int i=1;i<intervals.length;i++){
            int x1=intervals[i][0];
            int y1=intervals[i][1];
            int x2=res.get(res.size()-1)[0];
            int y2=res.get(res.size()-1)[1];
            if(y2>=x1){
                res.get(res.size()-1)[1]=Math.max(y1,y2);
            } else{
                res.add(new int[]{x1,y1});
            }
        }
        return res.toArray(new int[res.size()][]);
        
    }
}