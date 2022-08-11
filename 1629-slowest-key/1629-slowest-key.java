class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
      char[] keys = keysPressed.toCharArray();
      char ans = 'a';
      int longestDuration = 0;
      int pressedTime;
      int duration;
      for (int i = 0; i < n; i++) {
          if (i == 0) {
              pressedTime = 0;
          } else {
              pressedTime = releaseTimes[i - 1];
          }
          duration = releaseTimes[i] - pressedTime;
          if (duration == longestDuration) {
              if (ans < keys[i]) ans = keys[i];
          } else if (duration > longestDuration) {
              ans  = keys[i];
              longestDuration = duration;
          }
      }
      return ans;
    }
}