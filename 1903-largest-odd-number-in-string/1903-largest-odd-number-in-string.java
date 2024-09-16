class Solution {
    public String largestOddNumber(String num) {
        int i=num.length()-1;
        while(i>=0){
            char c=num.charAt(i);
            int d=(int) c-48;
            if(d%2==0) i--;
            else return num.substring(0,i+1);
        }
        return "";
    }
}