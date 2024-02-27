class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
#         hashset = set(nums)
        
#         res = 0
        
#         for num in nums:
#             if (num - 1) not in nums:
#                 count = 1
#                 current = num
#                 while (current + 1) in nums:
#                     count += 1
#                     current += 1
                
#                 res = max(res, count)
                
#         return res
        hashset = set(nums)
        
        
        res = 0
        for num in nums:
            if (num - 1) not in hashset:
                count = 1
                number_in_sequence = num
                while (number_in_sequence + 1) in hashset:
                    count += 1
                    number_in_sequence += 1
                res = max(res, count)
        
        
        return res