class Solution {
    public int triangularSum(int[] nums) {
        return execute(nums, nums.length);
    }
    
    private int execute(int[] nums, int length) {
        if (length == 1) return nums[0];
        
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = (nums[i] + nums[i+1]) % 10;
        }
        
        return execute(nums, length - 1);
    }
}