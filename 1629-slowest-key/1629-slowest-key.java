class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
//         Map<Character,Integer> map = new HashMap<>();
//         map.put(keysPressed.charAt(0), releaseTimes[0]);
        
        
        
//         for (int i = 1; i < keysPressed.length(); i++) {
//             char current = keysPressed.charAt(i);
//             int duration = releaseTimes[i] - releaseTimes[i-1];
//             map.put(current,duration);
//         }
        
//         char slowestKey = ' ';
//         int longestDur = 0;
//         for (Map.Entry<Character,Integer> set : map.entrySet()) {
//             int currentDur = set.getValue();
//             char currentKey = set.getKey();
            
//             if (currentDur > longestDur) {
//                 slowestKey = currentKey;
//                 longestDur = currentDur;
//             } else if (currentDur == longestDur && currentKey > slowestKey) {
//                 slowestKey = currentKey;
//             }
//         }
        
//         return slowestKey;
        
        int n = releaseTimes.length;
        int longestDur = releaseTimes[0];
        char slowestKey = keysPressed.charAt(0);
        
        for (int i = 1; i < n; i++) {
            int currentDur = releaseTimes[i] - releaseTimes[i-1];
            char currentKey = keysPressed.charAt(i);
            
            if (currentDur > longestDur || currentDur == longestDur && currentKey > slowestKey) {
                slowestKey = currentKey;
                longestDur = currentDur;
            }
        }
        
        return slowestKey;
    }
}