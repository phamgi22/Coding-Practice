class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        
        HashSet<Character> hash = new HashSet<>();
        
        while (right < s.length())  {
            if (!hash.contains(s.charAt(right))) {
                hash.add(s.charAt(right));
                right++;
                max = Math.max(hash.size(), max);
            } else {
                hash.remove(s.charAt(left));
                left++;
            }
        }
        
        return max;
        
        
        
    }
}