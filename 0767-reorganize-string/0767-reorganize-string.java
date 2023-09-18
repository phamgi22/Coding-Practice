class Solution {
    public String reorganizeString(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        
        while (pq.size() >= 2) {
            char cur = pq.remove();
            char next = pq.remove();
            
            sb.append(cur);
            sb.append(next);
            
            map.put(cur, map.get(cur) - 1);
            map.put(next, map.get(next) - 1);
            
            if (map.get(cur) > 0) pq.add(cur);
            if (map.get(next) > 0) pq.add(next);
        }
        
        
        if (!pq.isEmpty()) {
            char last = pq.remove();
            if (map.get(last) > 1) return "";
            sb.append(last);
        }
        
        return sb.toString();
    }
}