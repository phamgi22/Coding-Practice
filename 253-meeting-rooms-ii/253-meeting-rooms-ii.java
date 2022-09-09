class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        // System.out.println(Arrays.deepToString(intervals));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        
        pq.add(intervals[0][1]);
        
        for (int i = 1; i < intervals.length; i++) {
            System.out.println(pq);
            if (intervals[i][0] < pq.peek()) pq.add(intervals[i][1]);
            else if (intervals[i][0] >= pq.peek()) {
                pq.poll();
                pq.add(intervals[i][1]);
            }
        }
        return pq.size();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
        
//         pq.add(intervals[0][1]);
        
//         for (int i = 1; i < intervals.length; i++) {
//             if (intervals[i][0] < pq.peek()) {
//                 pq.add(intervals[i][1]);
//             } else {
//                 pq.poll();
//                 pq.add(intervals[i][1]);
//             }
//         }
        
//         return pq.size();
    }
}