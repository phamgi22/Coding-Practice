class Solution {
    int area;
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    bfs(grid, i, j);
                    max = Math.max(max, area);
                    area = 0;
                }
            }
        }
        
        return max;
    }
    
    private void bfs(int[][] grid, int i, int j) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[i].length - 1|| grid[i][j] == 0) return;
        
        area++;
        grid[i][j] = 0;
        
        bfs(grid, i, j + 1);
        bfs(grid, i, j - 1);
        bfs(grid, i + 1, j);
        bfs(grid, i - 1, j);
    }
}