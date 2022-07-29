class Solution:
    def getMaximumGenerated(self, n: int) -> int:
        num_map={}
        for i in range(0,n+1):
            # print("Initially Map is = {0}",format(num_map))
            if i==0: val=0
            elif i==1: val=1
            elif(i%2==0):
                n=i/2
                val = num_map.get(n)
                # print("{0} is even, value is {1}".format(i,num_map.get(n)))
            else:
                n=int(i/2)
                m=n+1
                val = num_map.get(n)+num_map.get(m)
                # print("{0} is even, value is {1}".format(i,val))
                # num_map.update({i:val})
            num_map.update({i:val})
        ans = max(num_map.values())
        # print(num_map)
        return ans