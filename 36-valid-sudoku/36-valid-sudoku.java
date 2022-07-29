class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int current = board[i][j];
                if (current != '.') {
                    if (!set.add(current + " found at row " + i ) ||
                       !set.add(current + " found at column " + j)||
                       !set.add(current + " found at sub-box " + i/3 +"-" + j/3)) return false;
                }
            }
        }
        
        
        return true;
    }
}