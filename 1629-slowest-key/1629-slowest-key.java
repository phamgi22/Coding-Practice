class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        int longest = releaseTimes[0];
        char slowest = keysPressed.charAt(0);
        
        for (int i = 1; i < n; i++) {
            int currentDuration = releaseTimes[i] - releaseTimes[i-1];
            
            if (currentDuration > longest || currentDuration == longest && 
               keysPressed.charAt(i) > slowest) {
                longest = currentDuration;
                slowest = keysPressed.charAt(i);
            }
        }
        
        return slowest;
    }
}