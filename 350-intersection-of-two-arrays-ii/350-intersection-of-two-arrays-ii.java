class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return intersect(nums2, nums1);
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // List<Integer> output = new ArrayList<>();
        int k = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                // output.add(num);
                nums1[k++] = num;
                map.put(num, map.get(num) - 1);
                count--;
            }
        }
        
        return Arrays.copyOfRange(nums1, 0, k);
    }
}