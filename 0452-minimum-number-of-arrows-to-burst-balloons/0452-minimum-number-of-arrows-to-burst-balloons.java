class Solution {
    public int findMinArrowShots(int[][] points) {
        int activities[][]=new int[points.length][3];
        for(int i=0;i<points.length;i++){
            activities[i][0]=i;
            activities[i][1]=points[i][0];
            activities[i][2]=points[i][1];
        }
        
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        int c=1;
        int lastEnd=activities[0][2];
        for(int j=1;j<points.length;j++){
            if(activities[j][1]>lastEnd){
                c++;
                lastEnd=activities[j][2];
            }
        }
        return c;
    }
}