class Solution:
    def isPalindrome(self, s: str) -> bool:
        string = ""
        
        for char in s:
            if char.isalnum():
                string += char.lower()
        
        
        
        return string == string[::-1]