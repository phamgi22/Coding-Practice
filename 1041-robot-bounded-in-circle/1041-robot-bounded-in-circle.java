class Solution {
    public boolean isRobotBounded(String instructions) {
        int dirX = 0;
        int dirY = 1;
        int x = 0;
        int y = 0;
        
        for (char c : instructions.toCharArray()) {
            if (c == 'G') {
                x += dirX;
                y += dirY;
            } else if (c == 'L') {
                int temp = dirX;
                dirX = -1 * dirY;
                dirY = temp;
            } else {
                int temp = dirY;
                dirY = -1 * dirX;
                dirX = temp;
            }
            
            // System.out.println("dirX: " + dirX);
            // System.out.println("dirY: " + dirY);
            
        }
        
        return (x == 0 && y == 0) || (dirX != 0 || dirY != 1);
    }
}