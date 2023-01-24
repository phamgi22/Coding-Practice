class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int c : nums) sum += c;
        
        int left = 0;        
        for(int i = 0; i < nums.length; i++) {
            int right = sum - left - nums[i];
            if (left == right) return i;
            left += nums[i];
        }
        
        return -1;
    }
}