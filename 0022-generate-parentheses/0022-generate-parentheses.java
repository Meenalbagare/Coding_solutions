class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        backtrack(res,"",0,0,n);
        return res;
    }
    public void backtrack(List<String> res,String currstring,int open,int close,int n){
        if(currstring.length()==n*2){
            res.add(currstring);
            return;
        }
        if(open<n) backtrack(res,currstring+"(",open+1,close,n);
        if(close<open) backtrack(res,currstring+")",open,close+1,n);
    }
}