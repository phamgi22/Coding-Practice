class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b - a));
        for (int stone : stones) pq.offer(stone);
        
        while (pq.size() > 1) {
            int y = pq.poll();
            int x = pq.poll();
            
            if (x != y) {
                y = y - x;
                pq.offer(y);
            }
        }
        
        return pq.size() != 0 ? pq.poll() : 0;
    }
}