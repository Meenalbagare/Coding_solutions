class Solution {
    boolean isPalindrome(int idx,int i,String s){
        int l=idx;
        int r=i;
        while(l<r && s.charAt(l)==s.charAt(r)){
            l++;
            r--;
        }
        return l>=r;
    }
    public void func(int idx,String s,List<List<String>> res,List<String> path){
        if(idx==s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(idx,i,s)){
                path.add(s.substring(idx,i+1));
                func(i+1,s,res,path);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> path=new ArrayList<>();
        func(0,s,res,path);
        return res;
    }
}