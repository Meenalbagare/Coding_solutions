class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
      
        rowmin=[]
        for i in range(len(matrix)):
            mini=float('inf')
            for j in range(len(matrix[0])):
                mini=min(mini,matrix[i][j])
            rowmin.append(mini)
        colmax=[]
        for i in range(len(matrix[0])):
            maxi=float('-inf')
            for j in range(len(matrix)):
                maxi=max(maxi,matrix[j][i])
            colmax.append(maxi)
        
        luck=[]
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if(matrix[i][j]==rowmin[i] and matrix[i][j]==colmax[j]):
                    luck.append(matrix[i][j])
        return luck
        
        
        
        