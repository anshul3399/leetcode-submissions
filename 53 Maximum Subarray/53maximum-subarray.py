class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currSum, maxSum, strtIndx, endIndx = 0,-sys.maxsize,0,0
        
        for i in range(len(nums)):
            currSum+=nums[i]
            if currSum > maxSum:
                maxSum=currSum
                endIndx=i
                
            if currSum < 0:
                currSum=0
                strtIndx=i+1
                endIndx=strtIndx
            # print(f"i:{i}=> start={strtIndx}, end={endIndx}, Sum_if_current_element_included={currSum}, MaxSum_untilNow={maxSum}")
        # print(f"subArr={nums[strtIndx:endIndx+1]},\tMaxm possible sum={currSum}")
        return maxSum