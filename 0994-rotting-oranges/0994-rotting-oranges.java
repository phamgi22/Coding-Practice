/*
I've spent some time working through the code to understand how it works:

First check if the input is invalid.
Then, iterate over every cell in the matrix with rotAdjacent if the cell is rotten.

In rotAdjacent there has to be bounds checking:
1.) check if we are at the left or right edge
2.) check if we are at the top or bottom edge
3.) check if the cell is empty
4.) check if this cell has already been touched by another depth-first search using rotAdjacent that hit it faster than the original rot we are recursing from currently.
In these four cases we just end.

Otherwise, we store minutes, which represents the current time-step in the cell. Minutes at the first time step is 2 to offset that values 0 and 1 are reserved to indicate empty and fresh cells. Then we recursively invoke rotAdjacent on all adjacent cells, left, right, top, and bottom.

By starting recursive rotting from each rotten cell, we can see if it is possible to spread adjacently to all fresh cells. After we finish with all the rotAdjacent, we return to orangesRotting, and check if there's any fresh cells left, in which case we fail.

Otherwise, we get the largest value from the grid, which represents the timestep at which the final fresh cell was rotted, remove the offset of 2, and return.
*/
class Solution {
    
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return -1;
        
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 2) rotAdjacent(grid, i, j, 2);
            }
        }
        
        int minutes = 2;
        for(int[] row : grid) {
            for(int cell : row) {
                if(cell == 1) return -1;
                minutes = Math.max(minutes, cell);
            }
        }
        
        return minutes - 2;
    }
    
    private void rotAdjacent(int[][] grid, int i, int j, int minutes) {
        if(i < 0 || i >= grid.length /* out of bounds */
          || j < 0 || j >= grid[0].length /* out of bounds */
          || grid[i][j] == 0 /* empty cell */
          || (1 < grid[i][j] && grid[i][j] < minutes) /* this orange is already rotten by another rotten orange */
          ) return;
        else {
            grid[i][j] = minutes;
            rotAdjacent(grid, i - 1, j, minutes + 1);
            rotAdjacent(grid, i + 1, j, minutes + 1);
            rotAdjacent(grid, i, j - 1, minutes + 1);
            rotAdjacent(grid, i, j + 1, minutes + 1);
        }
    }
}