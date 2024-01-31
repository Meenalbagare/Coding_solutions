class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
#         answer=[0 for i in range(len(temperatures))]
#         for i in range(len(temperatures)-1):
#             if temperatures[i+1]>temperatures[i]:
#                 answer[i]=1
#             elif (temperatures[i+1]<=temperatures[i] and i!=len(temperatures)-2 and temperatures[i]!=max(temperatures)):
#                 j=i+1
                
#                 while(j<len(temperatures) and temperatures[j]<=temperatures[i]):
#                     # print(i)
#                     # print("1",temperatures[i])
#                     # print("2",temperatures[j])
#                     answer[i]+=1
#                     j+=1
#                 answer[i]+=1
                
#             else:
#                 answer[i]=0
#         answer[len(temperatures)-1]=0
#         return answer
        lst = [0] * len(temperatures)
        stack = []
        for idx in range(len(temperatures)):
            while stack and temperatures[stack[-1]] < temperatures[idx]:
                lst[stack[-1]] = idx - stack[-1]
                stack.pop()
            
            stack.append(idx)
        return lst  