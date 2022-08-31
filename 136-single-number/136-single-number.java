class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        
        for (Map.Entry<Integer,Integer> set : map.entrySet()) {
            if (set.getValue() == 1) return set.getKey();
        }
        
        return 0;
    }
}