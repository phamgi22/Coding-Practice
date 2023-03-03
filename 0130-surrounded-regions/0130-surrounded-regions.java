class Solution {
    public void solve(char[][] board) {
    // Check top and bottom rows
    for (int j = 0; j < board[0].length; j++) {
        if (board[0][j] == 'O') validate(board, 0, j);
        if (board[board.length-1][j] == 'O') validate(board, board.length-1, j);
    }

    // Check left and right columns
    for (int i = 0; i < board.length; i++) {
        if (board[i][0] == 'O') validate(board, i, 0);
        if (board[i][board[0].length-1] == 'O') validate(board, i, board[0].length-1);
    }

    // Mark remaining 'O' cells as 'X'
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            if (board[i][j] == 'O') board[i][j] = 'X';
            if (board[i][j] == '1') board[i][j] = 'O'; // Restore marked cells
        }
    }
}

private void validate(char[][] board, int i, int j) {
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') return;

    board[i][j] = '1'; // Mark cell as visited
    validate(board, i+1, j); // Check down
    validate(board, i-1, j); // Check up
    validate(board, i, j+1); // Check right
    validate(board, i, j-1); // Check left
}

}