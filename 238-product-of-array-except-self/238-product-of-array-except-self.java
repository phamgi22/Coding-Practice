class Solution {
    public int[] productExceptSelf(int[] nums) {
//         int[] left = new int[nums.length];
//         int[] right = new int[nums.length];
//         right[nums.length-1] = 1;
//         left[0] = 1;
        
//         for (int  i=1; i<nums.length; i++) {
//             left[i] = nums[i-1] * left[i-1];
//         }
        
//         for (int i=nums.length - 2; i>=0; i--) {
//             right[i] = nums[i+1] * right[i+1];
//         }
        
//         for (int i=0; i<nums.length; i++) {
//             left[i] = left[i] * right[i];
//         }
        
//         return left;
        
        
        // output array does not count for the space complexity
        
        int[] answer = new int[nums.length];
        answer[0] = 1;
        int right = 1;
        
        for (int i=1; i<nums.length; i++) {
            answer[i] = nums[i-1] * answer[i-1];
        }
        
        for (int i=nums.length - 1; i>=0; i--) {
            answer[i] = answer[i] * right;
            right *= nums[i];
        }
        
        return answer;
             
    }
}