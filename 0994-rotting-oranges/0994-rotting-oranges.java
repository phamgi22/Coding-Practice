class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return -1;
        for (int i  = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) rot(grid, i, j, 2);
            }
        }
        
        int minutes = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) return -1;
                grid[i][j] -= 2;
                minutes = Math.max(minutes, grid[i][j]);
            }
        }
        
        return minutes;
    } 
    
    
    private void rot(int[][] grid, int i, int j, int minutes) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[i].length - 1 || 1 < grid[i][j] && grid[i][j] < minutes || grid[i][j] == 0) return;
        
        grid[i][j] = minutes;
        rot(grid, i + 1, j, minutes + 1);
        rot(grid, i - 1, j, minutes + 1);
        rot(grid, i, j + 1, minutes + 1);
        rot(grid, i, j - 1, minutes + 1);
    }
}