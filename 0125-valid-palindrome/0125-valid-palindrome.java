class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        
        String sbString = sb.toString().toLowerCase();
        String sbStringReverse = sb.reverse().toString().toLowerCase();
        
        return sbString.equals(sbStringReverse);
    }
}