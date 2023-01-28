class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int area = 0;
        
        while (l < r) {
            int cur = (r - l) * Math.min(height[l],height[r]);
            area = Math.max(cur,area);
            
            if (height[l] < height[r]) l++;
            else if (height[l] > height[r]) r--;
            else l++;
        }
        
        return area;
    }
}