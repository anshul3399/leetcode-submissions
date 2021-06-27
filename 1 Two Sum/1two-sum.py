class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mydict={}
        l1=[]
        for i in range(len(nums)):
            remaining = target - nums[i]
            if nums[i] not in mydict:
                mydict.update({remaining:i})
            else:
                # print(mydict)
                l1.append(mydict.get(nums[i]))
                l1.append(i)
                return l1