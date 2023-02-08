class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        
        int row = matrix.length;
        int col = matrix[0].length;
        int l = 0;
        int r = row * col - 1;
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int mid_e = matrix[mid/col][mid%col];
            if (mid_e == target) return true;
            else if (target < mid_e) r = mid - 1;
            else l = mid + 1;
        }
        
        return false;
    }
}