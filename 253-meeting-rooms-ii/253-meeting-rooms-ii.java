class Solution {
    public int minMeetingRooms(int[][] intervals) {
        // sorting intervals by their start timee
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int min = 0;
        
        for(int i = 0; i < intervals.length; i++){
            if(pq.isEmpty() || intervals[i][0] < pq.peek()){
                pq.add(intervals[i][1]);
                min = Math.max(min, pq.size());
            }
            else{
                while (!pq.isEmpty() && intervals[i][0] >= pq.peek())
                    pq.poll();
                pq.add(intervals[i][1]);
            }
            
        }
        
        return min;
    }
}