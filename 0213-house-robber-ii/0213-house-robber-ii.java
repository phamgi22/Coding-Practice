class Solution {
    public int rob(int[] nums) {
        
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        
        int[] copy1 = Arrays.copyOfRange(nums, 0, nums.length - 1);
        int[] copy2 = Arrays.copyOfRange(nums, 1, nums.length);
         
        return Math.max(robbing(copy1), robbing(copy2));
        
    }
    
    private int robbing(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
    
    
}