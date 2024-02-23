class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # num to frequency
        hashmap = {}
        
        # frequency to num
        freq = [[] for i in range(len(nums) + 1)]
        
        for num in nums:
            hashmap[num] = hashmap.get(num, 0) + 1
        
        for num, count in hashmap.items():
            freq[count].append(num)
            
            
        res = []
        
        for i in range(len(freq) - 1, 0, -1):
            for val in freq[i]:
                res.append(val)
                if len(res) == k:
                    return res