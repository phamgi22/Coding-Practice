class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += count(s, i, i);
            ans += count(s, i, i + 1);
        }
        return ans;
    }
    
    private int count(String s, int left, int right) {
        int ans = 0;
        while (left >= 0
              && right <= s.length() - 1
              && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            ans++;
        }
        
        return ans;
    }
}