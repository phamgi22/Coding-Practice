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
        }
        
        System.out.println("dirX: " + dirX);
        System.out.println("dirY: " + dirY);
        
        // robot return to origin mean it wont go outside of the plane
        if (x == 0 && y == 0) return true; 
        
        // robot does not face north mean it change direction mean it will eventually go back to origin
        if (dirY != 1) return true;
        
        return false;
    }
}