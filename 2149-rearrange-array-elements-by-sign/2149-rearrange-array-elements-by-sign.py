class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        pos=[]
        neg=[]
        for i in range(len(nums)):
            if(nums[i]>0):
                pos.append(nums[i])
            else:
                neg.append(nums[i])
        res=[]
        m=0
        k=0
        for i in range(len(nums)):
            if i%2==0:
                res.append(pos[m])
                m+=1
            else:
                res.append(neg[k])
                k+=1
        return res