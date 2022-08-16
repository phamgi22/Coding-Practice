class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int item: nums) set.add(item);
        return set.contains(0) ? set.size()-1 : set.size(); 
    }
}