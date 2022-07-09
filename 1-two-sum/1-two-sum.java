class Solution {
    public int[] twoSum(int[] nums, int target) {
        // make a map to store nums[i] and index position 
        // iterate through the array
        // calculate the complement for target (target minus the each number in the array)
        // if complement is in the map then return int[] result
        // if not put the number in the array
        
        // finally throw an exception if no match pair can be found
        
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            
            map.put (nums[i], i);
        }
        
        throw new IllegalArgumentException("ss");
    }
}