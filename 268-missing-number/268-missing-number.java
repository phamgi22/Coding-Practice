class Solution {
    public int missingNumber(int[] nums) {
        int trueSum = 0;
        
        for (int i = 0; i <= nums.length; i++) {
            trueSum += i;
        }
        
        int numsSum = 0;
        
        for (int num : nums) {
            numsSum += num;
        }
        
        return trueSum - numsSum;
    }
}