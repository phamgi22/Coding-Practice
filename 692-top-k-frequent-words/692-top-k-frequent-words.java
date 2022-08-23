class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // get the frequency of word in the array
        // get the words with the max frequency
        // words sorted in alphabetical order
        
        
        Map<String,Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                int fre1 = map.get(word1);
                int fre2 = map.get(word2);
                if (fre1 == fre2) return word2.compareTo(word1);
                return fre1 - fre2;
            }
        });
        
        
        for (Map.Entry<String,Integer> set : map.entrySet()) {
            pq.add(set.getKey());
            if (pq.size() > k) pq.poll();
        }
        
        List<String> result = new ArrayList<>();
        while(!pq.isEmpty()) result.add(pq.poll());
        
        Collections.reverse(result);
        return result;
    }
}