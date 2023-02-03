class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        int max = height[0];
        int count = 0;
        
        // max 0
        // height 0 1 0 2 1 0 1 3 2 1 2 1
        // lef    0
        left[0] = 0;
        
        for (int i = 1; i < height.length; i++) {
            left[i] = Math.max(height[i - 1], max);
            max = left[i];
        }
        
        
        right[height.length - 1] = 0;
        max = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(height[i + 1], max);
            max = right[i];
        }
        
        
        for (int i = 0; i < height.length; i++) {
            if (Math.min(left[i], right[i]) - height[i] > 0) {
             count += Math.min(left[i], right[i]) - height[i];
            // System.out.println(count);

            }
        }
        
        return count;
    }
}