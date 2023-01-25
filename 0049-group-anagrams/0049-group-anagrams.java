class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> grouped = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for (String string : strs) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            
            map.get(sorted).add(string);
        }
        
        grouped.addAll(map.values());
        return grouped;
    }
}