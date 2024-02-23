class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        smap = {}
        tmap = {}
        
        for i in range(len(s)):
            char = s[i]
            smap[char] = smap.get(char, 0) + 1
        
        for i in range(len(t)):
            char = t[i]
            tmap[char] = tmap.get(char, 0) + 1
        
        for key in smap:
            if key not in tmap or tmap[key] != smap[key]:
                return False

        
        return True
        