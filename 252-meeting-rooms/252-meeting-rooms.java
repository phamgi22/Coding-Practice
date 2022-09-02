class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals.length == 0) return true;
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        for (int i = 0; i < intervals.length - 1; i++) {
            int[] meeting1 = intervals[i];
            int[] meeting2 = intervals[i+1];
            
            if (meeting1[1] > meeting2[0]) {
                return false;
            }
        }
        
        return true;
    }
}