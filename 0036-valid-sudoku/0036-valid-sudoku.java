class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> unique = new HashSet<>();
        
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                char current = board[r][c];
                if (board[r][c] != '.') {
                    if (!unique.add(current + " found at row " + r)) return false;
                    if (!unique.add(current + " found at col " + c)) return false;
                    if (!unique.add(current + " found at box " + r/(board.length/3) + c/(board.length/3))) return false;
                    
                }
            }
        }
        
        return true;
        
    }
}