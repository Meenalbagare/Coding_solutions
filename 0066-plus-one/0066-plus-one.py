class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        for i in range(len(digits)-1,-1,-1):
            if digits[i]<9:
                digits[i]+=1
                return digits
            else:
                digits[i]=0
        digits=[0]*(len(digits)+1)
        digits[0]=1
        return digits
        
        