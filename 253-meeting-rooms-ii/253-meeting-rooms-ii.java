class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) return 0;
        
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        
        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int startP = 0;
        int endP = 0;
        int usedRooms = 0;
        
        while (startP < intervals.length) {
            if (start[startP] >= end[endP]) {
                usedRooms--;
                endP++;
            }
            
            usedRooms++;
            startP++;
        }
        
        return usedRooms;
    }
}