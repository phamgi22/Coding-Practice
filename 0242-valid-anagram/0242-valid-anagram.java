class Solution {
    public boolean isAnagram(String s, String t) {
        int[] atoz = new int[26];
        
        if (s.length() != t.length()) return false;
        
        for (int i = 0; i < s.length(); i++) {
            atoz[s.charAt(i) - 'a']++;
            atoz[t.charAt(i) - 'a']--;
        }
        
        for (int i : atoz) {
            if (i != 0) return false;
        }
        
        return true;
    }
}