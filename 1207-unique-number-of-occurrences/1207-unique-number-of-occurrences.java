class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> c = new ArrayList<>(map.values());
        Integer[] a = (Integer[])(c.toArray(new Integer[c.size()]));
        Arrays.sort(a);
        for (int i = 0; i < c.size() - 1; i++) {
            if (a[i] == a[i+1]) return false;
        }
        
        return true;
    }
}