class Solution {
    public int getMaxLen(int[] nums) {
            int maxLength = 0;
            int index = 0;
            while (index < nums.length) {
                int j = index;
                int negatives = 0;
                while (j < nums.length && nums[j] != 0) {
                    if (nums[j] < 0) negatives++;
                    if (negatives % 2 == 0) maxLength = Math.max(maxLength, j - index + 1);
                    j++;
                }
                index = j + 1;
            }
        
        index = nums.length - 1;
        while (index >= 0) {
                int j = index;
                int negatives = 0;
                while (j >= 0 && nums[j] != 0) {
                    if (nums[j] < 0) negatives++;
                    if (negatives % 2 == 0) maxLength = Math.max(maxLength, index - j + 1);
                    j--;
                }
                index = j - 1;
        }
        
        return maxLength;
    }
}