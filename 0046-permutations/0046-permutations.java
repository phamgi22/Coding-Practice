class Solution {
    public void backtrack(int n, List<Integer> nums, List<List<Integer>> output, int first) {
        // if all integers are used up
        if (first == n) output.add(new ArrayList<Integer>(nums));
        for (int i = first; i < n; i++) {
            Collections.swap(nums, first, i);
            backtrack(n, nums, output, first + 1);
            Collections.swap(nums, first, i);
        }
    }
    
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        ArrayList<Integer> nums_1st = new ArrayList<Integer>();
        for (int num : nums) {
            nums_1st.add(num);
        }
        
        int n = nums.length;
        backtrack(n, nums_1st, output, 0);
        return output;
    }
}