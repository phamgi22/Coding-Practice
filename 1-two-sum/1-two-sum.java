class Solution {
    public int[] twoSum(int[] nums, int target) {
        // instantiate a new hash map 
        // for every element in nums array
        // calculate the difference between target and the element value
        // if map contain the complement of element value
        // return new int array {position of element complement, and position of element}
        
        // if map does not contains the complement of the element value
        // add the element value as key with its position as value
        
//         Map<Integer, Integer> map = new HashMap<>();
        
//         for(int i = 0; i < nums.length - 1; i ++) {
//             int complement = target - nums[i];
//             if(map.containsKey(complement)) {
//                 return new int[] {map.get(complement), i};
//             }
            
//             map.put(nums[i], i);
//         }
        
//         return null;
        
        
        Map<Integer, Integer>  map = new HashMap<>(); 
        
        for(int i=0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        
        return null;
            
    }
}