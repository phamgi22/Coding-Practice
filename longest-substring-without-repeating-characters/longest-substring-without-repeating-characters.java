class Solution {
    public int lengthOfLongestSubstring(String s) {
        
    // solution 1: using set, time complexity O(n) following neetcode
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int result = 0;
        
        for(int i = 0; i < s.length(); i ++ ){
            while(charSet.contains(s.charAt(i))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            
            charSet.add(s.charAt(i));
            result = Math.max(result, i - left  + 1);
        }
        
        return result;
        
    // solution 2:     
    }
}