class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int activities[][]=new int[intervals.length][3];
        for(int i=0;i<intervals.length;i++){
            activities[i][0]=i;
            activities[i][1]=intervals[i][0];
            activities[i][2]=intervals[i][1];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        int lastEnd=activities[0][2];
        int c=0;
        for(int i=1;i<intervals.length;i++){
            if(activities[i][1]<lastEnd){
                c++;
            } else{
                lastEnd=activities[i][2];
            }
        }
        return c;
    }
}