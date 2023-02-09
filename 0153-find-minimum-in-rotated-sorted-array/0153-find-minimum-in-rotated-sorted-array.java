class Solution {
    public int findMin(int[] nums) {
        /*
        Give:
        - array length n
        - array is soorted in ascending order and is rotated between 1 and n times
        */
        
        int l = 0;
        int r = nums.length - 1;
        
        while (l < r) {
            int mid = l + (r - l) / 2;
            
            if (mid > 0 && nums[mid] < nums[mid - 1]) return nums[mid];
            else if (nums[l] <= nums[mid] && nums[mid] > nums[r]) l = mid + 1;
            else r = mid - 1;
        }
        
        return nums[l];
    }
}


// 