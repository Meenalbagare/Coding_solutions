class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack<>();
        int maxArea=0;
        int nsl[]=new int[heights.length];//right
        int nsr[]=new int[heights.length];//left
        //next smallest right
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                nsl[i]=s.peek();
            } else{
                nsl[i]=heights.length;
            }
            s.push(i);
        }
        s=new Stack<>();
        //next smallest right
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=-1;
            } else{
                nsr[i]=s.peek();
            }
           s.push(i);
        }
        //width= right-left-1
        //area=height*width
        //max_area=0, math.max(max_area, area)
        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=nsl[i]-nsr[i]-1;
            int area=height*width;
            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
    }
}