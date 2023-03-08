/*
*/


class Solution {
    private static final int EMPTY = Integer.MAX_VALUE;
private static final int GATE = 0;
private static final List<int[]> DIRECTIONS = Arrays.asList(
        new int[] {1, 0},
        new int[] {-1, 0},
        new int[] {0, 1},
        new int[] {0, -1});
    public void wallsAndGates(int[][] rooms) {
        if (rooms.length == 0 || rooms[0].length == 0) return;
        int row = rooms.length;
        int col = rooms[0].length;
        Queue<int[]> q = new LinkedList<>();
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rooms[i][j] == GATE) q.offer(new int[] {i, j});
            }
        }
        
        while(!q.isEmpty()) {
            int[] point = q.poll();
            int x = point[0];
            int y = point[1];
            for (int[] direction : DIRECTIONS) {
                int nextRow = x + direction[0];
                int nextCol = y + direction[1];
                if (nextRow >= 0 && nextRow <= row - 1 && nextCol >= 0 && nextCol <= col - 1 && rooms[nextRow][nextCol] == EMPTY) {
                    rooms[nextRow][nextCol] = rooms[x][y] + 1;
                    q.offer(new int[]{nextRow, nextCol});
                }
            }
            
        }
    }
}