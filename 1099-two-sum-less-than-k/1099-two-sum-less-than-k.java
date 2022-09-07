class Solution {
    public int twoSumLessThanK(int[] nums, int target) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int newSum = nums[i] + nums[j];
                if (newSum < target && newSum > maxSum) maxSum = newSum;
            }
        }

        return maxSum == Integer.MIN_VALUE ? -1 : maxSum;
    }
}