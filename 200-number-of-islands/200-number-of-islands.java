class Solution {
    public int numIslands(char[][] grid) {
        /*
        Give:
        - a m x n grid represents a map of 1(land) and 0(water)
        - return number of island(1 which surrounded by water all four grid)
        */
        int count = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    bfs(grid, i, j);
                }
            }
        }
        
        return count;
    }
    
    
    public void bfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >=grid[i].length || grid[i][j] == '0') return;
        
        grid[i][j] = '0';
        bfs(grid, i + 1, j);
        bfs(grid, i - 1, j);
        bfs(grid, i, j + 1);
        bfs(grid, i, j - 1);
    }
}