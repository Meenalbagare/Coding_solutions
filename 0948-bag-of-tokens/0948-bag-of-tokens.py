class Solution:
    def bagOfTokensScore(self, tokens: List[int], power: int) -> int:
        score=0
        tokens.sort()
        max_score=0
        l=0
        r=len(tokens)-1
        while(l<=r):
            if(power>=tokens[l]):
                power-=tokens[l]
                score+=1
                l+=1
                max_score=max(max_score,score)
            elif(score>=1):
                power+=tokens[r]
                score-=1
                r-=1
            else:
                break
        return max_score
                
      