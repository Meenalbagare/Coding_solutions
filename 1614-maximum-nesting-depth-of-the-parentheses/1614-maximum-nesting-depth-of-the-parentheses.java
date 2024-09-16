class Solution {
    public int maxDepth(String s) {
        int count=0;
        int para=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
                
            }
            para=Math.max(count,para);
            if(c==')'){
                count--;
            }
        }
        return para;
    }
}