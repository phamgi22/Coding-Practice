class Solution {
    public boolean isPalindrome(String s) {
        // initiate a String to store the input string removed punctuation
        // iterating through each character in the input String
        //          if the character is digit or is a letter then add to removed punctuation S
        // toLowercase the removed String
        // iterate backward to validate  valindrome of removed String (two pointers)
        
        
//         String sRemoved = "";
//         for (char c : s.toCharArray()) {
//             if (Character.isDigit(c) || Character.isLetter(c)) {
//                 sRemoved += c;
//             }
//         }
        
//         sRemoved = sRemoved.toLowerCase();
//         int left_Pointer = 0;
//         int right_Pointer = sRemoved.length() - 1;
        
//         while (left_Pointer <= right_Pointer) {
//             if (sRemoved.charAt(left_Pointer) != sRemoved.charAt(right_Pointer)) {
//                 return false;
//             }
            
//             left_Pointer++;
//             right_Pointer++;
//         }
        
//         return true;
        
        String fixed_string = "";
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                fixed_string += c;
            }
        }
                
        fixed_string = fixed_string.toLowerCase();
        
        int a = 0;
        int b = fixed_string.length() - 1;
        
        while (a <= b) {
            if (fixed_string.charAt(a) != fixed_string.charAt(b)) {
                return false;
            }
            
            a++;
            b--;
        }
                
        return true;        
    }
}