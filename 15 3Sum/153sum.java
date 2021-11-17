class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) 
            return result;
        
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-2; i++){
            // for ensuring that we do not take same fix element twice, to avoide duplication of triplet
            if(i>0 && nums[i]==nums[i-1]) 
                continue;
            
            int a = nums[i];
            int s = i+1;
            int e = n-1;
            while(s<e){
                if(a+nums[s]+nums[e]==0)
                {
                    List<Integer> triplet = new ArrayList();
                    triplet.add(a);
                    triplet.add(nums[s]);
                    triplet.add(nums[e]);
                    result.add(triplet);
                    s++;
                    e--;
                    // ensuring that while having a element fixed (a) if we find elements in start_index and end_index twice we take them only once, ensuring no duplication of triplet
                    while(s<e && nums[s]==nums[s-1]){
                        s++;
                    }
                    while(s<e && nums[e]==nums[e+1]){
                        e--;
                    }
                }
                else if(a+nums[s]+nums[e]<0){
                    s++;
                }
                else{
                    e--;
                }
            }
        }
        return result;
    }
}