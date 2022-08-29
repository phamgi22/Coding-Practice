class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            int current =  nums[i];
            int currentLength = 1;
            
            if (!set.contains(current - 1)) {
                while (set.contains(current + 1)) {
                    current += 1;
                    currentLength += 1;
                }
                max = Math.max(max,currentLength);
            }
        }
        
        return max;
    }
}