class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
#         substring = set()
        
#         l = 0
#         res = 0
#         for r in range(len(s)):
#             while s[r] in substring:
#                 substring.remove(s[l])
#                 l += 1
                
#             substring.add(s[r])
#             r += 1
#             res = max(res, len(substring))
#         return res
            
        hashset = set()
        l = 0
        res = 0
        r = 0
        while r < len(s):
            while s[r] in hashset:
                hashset.remove(s[l])
                l += 1
            
            hashset.add(s[r])
            r += 1
            res = max(res, len(hashset))
        
        return res