class Solution {
    public boolean isRobotBounded(String instructions) {
        int[][] directions = new int[][] {{0,1}, {1,0}, {0,-1}, {-1,0}};
        
        // initial position is the center
        int x = 0;
        int y = 0;
        int index = 0;
        
        for (char i : instructions.toCharArray()) {
            if (i == 'L') {
                index = (index + 3) % 4;
            } else if (i == 'R') {
                index = (index + 1) % 4;
            } else {
                x += directions[index][0];
                y += directions[index][1];
            }
        }
        
        // after one cycle:
        // robot return too initial positiono
        // or robot doesnt face north
        
        return (x == 0 && y == 0) || index != 0;
    }
}