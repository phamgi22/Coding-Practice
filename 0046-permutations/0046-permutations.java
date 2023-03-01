class Solution {
    public void backtrack(int n, List<Integer> nums, List<List<Integer>> output, int first) {
        if (first == n) output.add(new ArrayList<Integer>(nums));
        
        for (int i = first; i < n; i++) {
            // place i-th integer first in the current permutation
            Collections.swap(nums, first, i);
            // we use the next integer to complete the permutation
            backtrack(n, nums, output, first + 1);
            // backtrack
            Collections.swap(nums, first, i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();
        for (int num : nums) permutation.add(num);
        backtrack(nums.length, permutation, output, 0);
        return output;
    }
}