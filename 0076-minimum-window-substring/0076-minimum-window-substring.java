class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty()) return "";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int i = 0;
        int j = 0;
        int left = 0;
        int right = s.length() - 1;
        int min = s.length();
        boolean found = false;
        int count = map.size();
        
        while (j < s.length()) {
            char end = s.charAt(j++);
            if (map.containsKey(end)) {
                map.put(end, map.get(end) - 1);
                if (map.get(end) == 0) count -= 1;
            }
            
            if (count > 0) continue;
            while (count == 0) {
                char start = s.charAt(i++);
                if (map.containsKey(start)) {
                    map.put(start, map.get(start) + 1);
                    if (map.get(start) > 0) count += 1;
                }
            }
            
            if ((j - i) < min) {
                left = i;
                right = j;
                min = j - i;
                found = true;
            }
        }
        
        
        return !found ? "" : s.substring(left - 1, right);
    }
}