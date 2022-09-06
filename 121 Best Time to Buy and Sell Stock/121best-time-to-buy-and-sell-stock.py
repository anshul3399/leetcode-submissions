class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minSoFar = prices[0]
        maxProfit=0
        for i in range(0,len(prices)):
            currentDayPrice = prices[i]
            if currentDayPrice < minSoFar:
                minSoFar = currentDayPrice
            
            currProfit = currentDayPrice - minSoFar
            if currProfit>maxProfit:
                maxProfit = currProfit
            # print(f"currentDayPrice={currentDayPrice}, minSoFar = {minSoFar}, currProfit={currProfit}, maxProfit={maxProfit}")
        
        return maxProfit