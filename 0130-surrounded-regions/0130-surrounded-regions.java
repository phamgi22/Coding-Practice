class Solution {
    public void solve(char[][] board) {
        
        if (board.length == 0 || board[0].length == 0) return;
        
        int rows = board.length;
        int columns = board[0].length;
        
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][columns - 1] == 'O') dfs(board, i, columns - 1);
        }
        
        for (int j = 0; j < columns; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j);
            if (board[rows - 1][j] == 'O') dfs(board, rows - 1, j);
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == '*') board[i][j] = 'O';
            }
        }
    }
    
    private void dfs(char[][] board, int i, int j) {
        if (i > board.length - 1 || i < 0 || j > board[0].length - 1 || j < 0) return;
        
        if (board[i][j] == 'O') board[i][j] = '*';
        
        if (i > 0 && board[i - 1][j] == 'O') dfs(board, i - 1, j);
        
        if (i < board.length - 1 && board[i+1][j] == 'O') dfs(board, i + 1, j);
        
        if (j > 0 && board[i][j - 1] == 'O') dfs(board, i, j - 1);
        
        if (j < board[0].length - 1 && board[i][j+1] == 'O') dfs(board, i, j + 1);
    }
}