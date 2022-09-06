class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length(); // getting the length of the string
        char[] char_count = new char[26];
        int start = 0;
        int max_length = 0;
        int max_count = 0; // character that is repeated the most in the string
        
        
        // AABABBA
        // looping through the string
        // [1][][][][][][][][][][][][][][][][][][][][][][][][][][]
        for (int end = 0; end < n; end++) {
            char_count[s.charAt(end) - 'A']++;
            int current_char_count = char_count[s.charAt(end) - 'A'];
            max_count = Math.max(max_count, current_char_count);
            
            while (end - start - max_count + 1 > k) {
                char_count[s.charAt(start) - 'A']--;
                start++;
            }
            
            max_length = Math.max(max_length, end - start + 1);
        }
        
        
        
        
        // System.out.println(Arrays.toString(char_count));
        
        return max_length;
    }
}