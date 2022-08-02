class Solution {
    public int firstUniqChar(String s) {
        // hashmap each char and its occurence
        // for each char in s, lookup in map if value return 1
        // return -1
        
        
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) return i;
        }
        
        return -1;
    }
}