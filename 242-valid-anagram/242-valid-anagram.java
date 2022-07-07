class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())  return false;
        // anagrams: words which contains the exact same characters but in diff order
        
        
//         // Sorting approach:
//         char[] sC = s.toCharArray();
//         char[] tC = t.toCharArray();
//         Arrays.sort(sC);
//         Arrays.sort(tC);
//         return Arrays.equals(sC,tC);
        
        
        // Frequency counter approach
        int[] charCount = new int[26];             // bc there are 26 character in alphabet
        for (int i = 0; i<s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
        
    }
}