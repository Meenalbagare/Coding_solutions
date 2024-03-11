class Solution:
    def customSortString(self, order: str, s: str) -> str:
        d={i:0 for i in order}
        
        for i in s:
            if i in d:
                d[i]+=1
                       
        res=''
        for i in order:
            res+=i*d[i]
        for i in s:
            if i not in order:
                res+=i
                
        return res
    
      
            
            
            
            
        
        