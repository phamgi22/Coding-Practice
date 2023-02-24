class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : tasks) map.put(c, map.getOrDefault(c, 0) + 1);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.addAll(map.values());
        int cycles = 0;
        
        while(!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n + 1; i++) {
                if (!pq.isEmpty()) temp.add(pq.poll());
            }
            
            for (int j : temp) {
                if (--j > 0) {
                    pq.add(j);
                }
            }
            cycles += pq.isEmpty() ? temp.size() : n + 1; 
        }
        
        return cycles;
    }
}