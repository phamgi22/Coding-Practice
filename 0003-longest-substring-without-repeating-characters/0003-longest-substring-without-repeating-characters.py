class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
            
        hashset = set()
        res = 0
        r = 0
        l = 0
        while r < len(s):
            while s[r] in hashset:
                hashset.remove(s[l])
                l += 1
            
            hashset.add(s[r])
            r += 1
            res = max(res, len(hashset))
        return res