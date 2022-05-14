class Tri {
  private int n = 38;
  public int[] nums = new int[n];

  int helper(int k) {
    if (k == 0) return 0;
    if (nums[k] != 0) return nums[k];

    nums[k] = helper(k - 1) + helper(k - 2) + helper(k - 3);
    return nums[k];
  }

  Tri() {
    nums[1] = 1;
    nums[2] = 1;
    helper(n - 1);
  }
}

class Solution {
  public static Tri t = new Tri();
  public int tribonacci(int n) {
    return t.nums[n];
  }
}