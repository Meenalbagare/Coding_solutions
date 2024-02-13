class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxprofit=0;
        buyprice=float('inf')
        for i in range(len(prices)):
            if(buyprice<prices[i]):
                profit=prices[i]-buyprice
                maxprofit=max(profit,maxprofit)
            else:
                buyprice=prices[i]
        return maxprofit