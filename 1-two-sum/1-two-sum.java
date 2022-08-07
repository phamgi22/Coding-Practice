class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        Give:
        - array of integers nums
        - integer target
        - return indices of the two numbers that added up to target
        - can return in any order
        - is it guarantee that there will be a correct answer
        
        - for each number in array
        - search in map if there's a number x where x + number = target
        
        */
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (!map.containsKey(complement)) {
                map.put(nums[i], i);
            } else {
                return new int[] {i, map.get(complement)};
            }
        }
        
        return new int[0];
        
    }
}