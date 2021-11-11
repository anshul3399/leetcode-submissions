class Solution {
    public int pivotIndex(int[] nums) {
        int pivot_index=-1;

        if(nums == null || nums.length==0)
            pivot_index=-1;
        int sumOfElements = Arrays.stream(nums).sum();
        int right_sum = 0;
        int left_sum = 0;
        for (int i=0;i<nums.length;i++){
            if(sumOfElements-left_sum-nums[i]==left_sum){
                pivot_index=i;
                return pivot_index;
            }
            left_sum+=nums[i];
        }
        return pivot_index;
    }
}