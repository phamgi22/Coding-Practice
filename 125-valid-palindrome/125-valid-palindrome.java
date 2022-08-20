class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
            
        }
        
        System.out.println(sb.toString());
        
        return sb.toString().equals(sb.reverse().toString());
    }
}