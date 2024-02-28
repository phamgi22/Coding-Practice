class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        '''
        initialize hashmap
        l and r pointer 
        
        calculate the number of char need replace x
        if x <= k: we update the length of our max winleng, update the fre of the character at r pointer, and then update r pointer
        if x > k: shrink the length of the the windown length by shifting l pointer to the right
        
        return
        '''
        
        count = {}
        l = 0
        res = 0
        for r in range(len(s)):
            count[s[r]] = 1 + count.get(s[r], 0)
            while (r - l + 1) - max(count.values()) > k:
                
                count[s[l]] -= 1
                l += 1
            
            
            res = max(res, r - l + 1)
            
        
        return res