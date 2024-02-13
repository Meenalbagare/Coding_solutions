class Solution {
    public String firstPalindrome(String[] words) {
        for(String word: words){
            StringBuilder reverse=new StringBuilder(word).reverse();
            if(word.equals(reverse.toString())){
                return word;
            }
        }
        return "";
    }
}

 