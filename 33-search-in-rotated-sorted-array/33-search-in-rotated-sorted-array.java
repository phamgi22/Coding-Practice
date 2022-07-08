class Solution {
    public int search(int[] nums, int target) {
        /*
        Initial thought:
        - a nums array sorted in ascending order (distinct = unique value)
        - before being passed into the param, nums array is rotated at pivot index k (inclusive,
          swap including k)
        - example: 1234567    k=3 -> 4  swapped array: 4567123
        - given a target t
        - write a function check if t is present in nums array
        - have to write in O log n time complexity
        - O log n, we usually think about binary search
        */
        
        
        /*
        Pseudocode:
        - find the smallest element in nums array using modified binary search
        - ex: 4567123    t=2
        - found 1
        - find out if t belong to left portion - binary search
        - find out if t belong to the right portion - binary search
        */
        int start = 0, end = nums.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) return mid;
      else if (nums[mid] >= nums[start]) {
        if (target >= nums[start] && target < nums[mid]) end = mid - 1;
        else start = mid + 1;
      }
      else {
        if (target <= nums[end] && target > nums[mid]) start = mid + 1;
        else end = mid - 1;
      }
    }
    return -1;
  
    }
}