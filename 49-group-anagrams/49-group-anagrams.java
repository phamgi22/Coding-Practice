class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
        Give: 
        - an array of strings named strs
        - group the anagrams together
        - return answer in any order
        
        - a hashmap: key - sorted string
                     value - when sorted equal to key
        */
        
        
        Map<String,List<String>> map = new HashMap<>();
        for (String string : strs) {
            char[] current = string.toCharArray();
            Arrays.sort(current);
            String sorted = new String(current);
            if (!map.containsKey(sorted))map.put(sorted, new ArrayList<>());
            map.get(sorted).add(string);

        }
        
        return new ArrayList<>(map.values());
    }
}