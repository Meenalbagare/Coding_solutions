class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        int balance=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                if(balance>0) res+=i;
            balance++;
            }
            else{
                balance--;
                if(balance>0) res+=i;
            }
            
        }
        return res;
    }
}