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
        
        HashMap<Character, Integer> durationMap = new HashMap<>();
        durationMap.put(keysPressed.charAt(0), releaseTimes[0]);
        // find and store the keypress duration for each key in the durationMap
        for (int i = 1; i < releaseTimes.length; i++) {
            int currentDuration = releaseTimes[i] - releaseTimes[i - 1];
            char currentKey = keysPressed.charAt(i);
            durationMap.put(currentKey,
                Math.max(durationMap.getOrDefault(currentKey, 0), currentDuration));
        }
        char slowestKey = ' ';
        int longestPressDuration = 0;
        // iterate over the map to find the slowest key
        for (Map.Entry mapElement : durationMap.entrySet()) {
            int duration = (int) mapElement.getValue();
            char key = (char) mapElement.getKey();
            if (duration > longestPressDuration) {
                longestPressDuration = duration;
                slowestKey = key;
            } else if (duration == longestPressDuration && key > slowestKey) {
                slowestKey = key;
            }
        }
        return slowestKey;
    }
}