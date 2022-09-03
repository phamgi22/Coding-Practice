class Solution {
    public long subArrayRanges(int[] nums) {
        long sum = 0; // initiate a sum
        int size = nums.length;
        
        // for every single num in nums array
        for (int i = 0; i < size; i++) {
            int min = nums[i];
            int max = nums[i];
            
            // for every single number from i and after
            for (int j = i; j < size; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                sum += max - min;
            }
        }
        
        return sum;
    }
}