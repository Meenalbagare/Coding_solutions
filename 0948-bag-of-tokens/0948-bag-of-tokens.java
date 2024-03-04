class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
        int max_score=0;
        int l=0;
        int r=tokens.length-1;
        while(l<=r){
            if(power>=tokens[l]){
                power-=tokens[l];
                score++;
                l++;
                max_score=Math.max(max_score,score);
            }
            else if(score>=1){
                power+=tokens[r];
                score--;
                r--;
            }
            else{
                break;
            }
        }
        return max_score;
    }
}