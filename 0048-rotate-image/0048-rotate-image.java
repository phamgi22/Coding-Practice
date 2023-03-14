class Solution {
    int n;
    public void rotate(int[][] matrix) {
        n = matrix.length;
        transpose(matrix);
        reverse(matrix);
    }
    
    
    private void transpose(int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
    
    private void reverse(int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;            
            }
        }
    }
}