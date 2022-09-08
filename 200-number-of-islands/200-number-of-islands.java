class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    callBFS(grid, i, j);
                }
            }
        }
        
        return islands;
    }
    
    private void callBFS(char[][] grid, int i, int j) {
        // out of bound OR reach the end of the island ===> break
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[i].length - 1 || grid[i][j] == '0') {
            return;
        }
        
        grid[i][j] = '0';
        
        callBFS(grid, i - 1, j);
        callBFS(grid, i + 1, j);
        callBFS(grid, i, j+1);
        callBFS(grid, i, j-1);
    }
}