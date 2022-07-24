class Solution {
    public int maxSubArray(int[] nums) {
    /*
    -2 1 -3 4 -1 2 1 -5 4
    */
        
//         int cur_sum = nums[0];
//         int max_sum = cur_sum;
        
//         for (int i = 0; i < nums.length; i++) {
//             cur_sum = Math.max(nums[i], cur_sum + nums[i]);
//             max_sum = Math.max(max_sum, cur_sum);
//         }
        
//         return max_sum;
        

//         int currentSum = nums[0];
//         int maxSum = currentSum;
        
//         for (int i = 0; i < nums.length; i++) {
//             currentSum = Math.max(nums[i], currentSum + nums[i]);
//             maxSum = Math.max(currentSum, maxSum);
//         }
        
//         return maxSum;
         int currentSum = nums[0];
        int maxSum = currentSum;
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        
        return maxSum;
    }
}