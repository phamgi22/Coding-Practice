class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right = 0;
        int left = 0;
        int longest = 0;
        Set<Character> set = new HashSet<>();
        
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                longest = Math.max(longest, set.size());
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        
        return longest;
    }
}