class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hashset = set(nums)
        res = 0
        
        for num in hashset:
            if (num - 1) not in hashset:
                count = 1
                current = num
                while current + 1 in hashset:
                    count += 1
                    current += 1
                
                res = max(res, count)
        
        return res