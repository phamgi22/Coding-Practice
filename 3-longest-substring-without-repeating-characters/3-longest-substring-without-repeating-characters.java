class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Explain how you will solve this problem
        /*
        - Find the length of the longest substring without repeating character
        - I will be using 2 pointer for sliding window method
        - left pointer would be poitning to the 1st character of the substring
        - right pointer would be pointing to the last chacracter of the substring
        - i will use a hashset to store the substring since set can only store unique value
        - iterating through the length of input string s
        - left pointer is set at the first character of string s/index 0
        - right pointer is also set at the first character of string s/index 0
    
        - let right pointer go from the first character of the string to the last character
        - if right pointer is pointing to a character that is not present in the set
        -           character is add to the set
        -           right pointer increment
        -           update the max size of the set (which is our longest substring length w no                     repeating character)
        
        - if right pointer is pointing to the character that IS PRESENT in the set
        -           remove the most left character (character at index left)
        -           increment left
        
        
        - finally return the max size of the set
            abcba
              ---
        */
        
        
        
        
        
        
        // Explain how would you demonstrate your solution with code
        
        int left_pointer = 0;
        int right_pointer = 0;
        int max = 0;
        
        HashSet<Character> set = new HashSet<>();
        
        while (right_pointer < s.length()) {
            if (!set.contains(s.charAt(right_pointer))) {
                set.add(s.charAt(right_pointer));
                max = Math.max(set.size(), max);
                right_pointer++;
            } else {
                set.remove(s.charAt(left_pointer));
                left_pointer++;
            }
        }
        
        return max;
        
    }
}