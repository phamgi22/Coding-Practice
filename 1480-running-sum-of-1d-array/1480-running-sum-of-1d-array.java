class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            result[i] = sum + nums[i];
            sum += nums[i];
        }
        
        return result;
    }
}