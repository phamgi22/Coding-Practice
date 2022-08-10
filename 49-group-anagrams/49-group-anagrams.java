class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*
        Give:
        - an array of strings
        - group the anagrams together
        - can return answer in any order
        - anagrams = words that use the exact characters as each other but in different order
        
        
        Algo1:
        - create a return value of list of list of strings
        - create a map that store and map the string values when sorted is the same as the sorted value
        
        */
        
        List<List<String>> groups = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        
        for (String string : strs) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            
            if (!map.containsKey(sortedString)) map.put(sortedString, new ArrayList<>());
            map.get(sortedString).add(string);
        }
        
        groups.addAll(map.values());
        return groups;
            
    }
}