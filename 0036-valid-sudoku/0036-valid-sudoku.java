class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                if (current != '.') {
                    if(!seen.add(current + " found in row " + i) ||
                    !seen.add(current + " found in column " + j) ||
                    !seen.add(current + " found in subbox " + i/3 + "-" + j/3)) return false;
                    
                }
            }
        }
        
        return true;
    }
}