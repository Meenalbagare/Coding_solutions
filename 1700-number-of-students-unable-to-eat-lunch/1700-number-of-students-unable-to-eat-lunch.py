class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        counter=[0,0]
        for i in students:
            counter[i]+=1
        
        left=len(sandwiches)
        for j in sandwiches:
            if counter[j]==0:
                break
            if left==0:
                break
            counter[j]-=1
            left-=1
        return left
    
    