class Solution {
public:
    int bagOfTokensScore(vector<int>& tokens, int power) {
        int score=0;
        int max_score=0;
        int l=0;
        int r=tokens.size()-1;
        sort(tokens.begin(),tokens.end());
        while(l<=r){
            if(power>=tokens[l]){
                power-=tokens[l];
                score++;
                l++;
                max_score=max(max_score,score);
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
};


