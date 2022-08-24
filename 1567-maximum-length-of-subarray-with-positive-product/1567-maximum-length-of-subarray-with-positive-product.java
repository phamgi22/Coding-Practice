class Solution {
    public int getMaxLen(int[] nums) {
        /*
        */
        
        // final max length of subarray that we are going to return
        int max = 0;
        
        // an outer for loop
        for (int i = 0; i < nums.length; i++) {
            if (nums.length - i < max) {
                return max;
            }
            // check if the number is a non-zero number
            if (nums[i] != 0) {
                // count the negative number, if nums[i] > 0, neg = 0
                //                            if nums[i] < 0, neg = 1
                int negatives = nums[i] > 0 ? 0 : 1;
                // update max subarray length,if nums[i] > 0, right arg = 1
                //                            if nums[i] < 0, right arg = 0
                max = Math.max(max, nums[i] > 0 ? 1 : 0);
                // innter loop, starting from the element on the right on i
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] < 0) {
                        negatives++;
                    } else if (nums[j] == 0) {
                        break;
                    }
                    if (negatives % 2 == 0) {
                        max = Math.max(max, j - i + 1);
                    }
                }
                
            }
        }
        
        return max;
        
    }
}