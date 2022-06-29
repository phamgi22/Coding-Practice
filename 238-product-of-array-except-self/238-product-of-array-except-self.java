class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] product = new int[n];
        
        left[0] = 1;
        right[n-1] = 1;
        
        for (int i = 1; i <= n - 1; i++) {
            left[i] = nums[i-1] * left[i-1];
        }
        
        for (int i = n - 2; i >= 0; i--) {
            right[i] = nums[i+1] * right[i+1];
        }
        
        for (int i = 0; i < n; i ++) {
            product[i] = left[i] * right[i];
        }
        
        return product;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         int[] left = new int[nums.length];
//         int[] right = new int[nums.length];
//         int[] output = new int[nums.length];
        
//         left[0] = 1;
//         right[nums.length-1] = 1;
        
//         //1  2  3  4
//         //0  1  2  6
        
//         for (int i=1; i<nums.length; i++) {
//             left[i] = nums[i-1] * left[i-1];
//         }
        
//         for (int i=nums.length-2; i>=0; i--) {
//             right[i]= nums[i+1] * right[i+1];
//         }
        
        
//         for (int i=0; i<nums.length; i++) {
//             output[i] = left[i] * right[i];
//         }
        
//         return output;
        
            
    }
}