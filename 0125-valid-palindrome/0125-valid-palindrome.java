class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                sb.append(c);
            }
        }
        
        String sbString = sb.toString().toLowerCase();
        
        
        return sbString.equals(sb.reverse().toString().toLowerCase());
    }
}