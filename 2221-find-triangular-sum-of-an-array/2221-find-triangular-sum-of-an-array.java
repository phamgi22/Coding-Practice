class Solution {
    public int triangularSum(int[] nums) {
        return execute(nums, nums.length);
    }
    
    public int execute(int[] nums, int length) {
        if (length == 1) return nums[0];
        
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = (nums[i] + nums[i+1]) % 10;
        }
        
        return execute(nums, length - 1);
    }
}

// class Solution {
//     public int triangularSum(int[] nums) {
//         return find(nums,nums.length);
//     }
    
//     public int find(int[] a, int n){
//         if(n == 1)
//             return a[0];
            
//         for(int i=0;i<n-1;i++){
//             a[i] = (a[i] + a[i+1])%10; 
//         }
//         return find(a,n-1);
//     }
// }