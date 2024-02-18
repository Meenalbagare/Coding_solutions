class Solution:
    def sequentialDigits(self, low: int, high: int) -> List[int]:
        v=[]
        c="123456789"
        for i in range(len(c)):
            for j in range(i+1,len(c)+1):
                curr=int(c[i:j])
                if low<=curr<=high:
                    v.append(curr)
        v.sort()
        return v
           