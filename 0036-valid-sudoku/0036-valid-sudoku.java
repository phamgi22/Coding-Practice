class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> uni = new HashSet<>();
        int side = board.length;
        
        for (int r = 0; r < side; r++) {
            for (int c = 0; c < side; c++) {
                char current = board[r][c];
                if (current != '.') {
                    if (!uni.add(current + " found at row " + r) ||
                        (!uni.add(current + " found at col " + c)) ||
                        (!uni.add(current + " found at box " + r/3 + c/3))) return false;
                }
            }
        }
        
        return true;
    }
}