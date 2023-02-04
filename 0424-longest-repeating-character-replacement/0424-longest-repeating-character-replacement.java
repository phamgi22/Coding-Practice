class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26]; // store count of each 26 character
        int longest = 0; // will return longest length of substring with only 1 repeating character
        int max = 0; // Max count of character that appear the most so far
        int l = 0; // left pointer
        
        for (int r = 0; r < s.length(); r++) { // incrementing right pointer
            arr[s.charAt(r) - 'A']++; // counting everytime each character appear
            max = Math.max(max, arr[s.charAt(r) - 'A']); // updating the max count of character that appear the most
            
            if (r - l + 1 - max > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            
            longest = Math.max(longest, r - l + 1);
        }
        
        return longest;
    }
}