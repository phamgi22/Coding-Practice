class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int pressTime[] = new int[26];
        int max = 0;
        char longestPressChar = 'a';
        for(int i=0;i<releaseTimes.length;i++){
            char key = keysPressed.charAt(i);
            int index = key - 'a';
            if( i == 0) {
                pressTime[index] = releaseTimes[i];
            }
            else {
                pressTime[index] = releaseTimes[i] - releaseTimes[i-1];
            }
            if(max < pressTime[index]) {
                max = pressTime[index];
                longestPressChar = key;
            }
            else if(max == pressTime[index] && longestPressChar < key) {
                longestPressChar = key;
            }
        }
    
        
        return longestPressChar;
    }
}