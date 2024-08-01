class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stac = new Stack<>();
        int ans =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==')'){
                if(stac.isEmpty()){
                    ans++;
                } else{
                    stac.pop();
                }
            }else{
                stac.push(s.charAt(i));
            }
        }
        return ans+stac.size();
}}