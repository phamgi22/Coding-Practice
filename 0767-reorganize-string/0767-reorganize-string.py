class Solution:
    def reorganizeString(self, s: str) -> str:
        hashmap = {}
        
        for char in s:
            hashmap[char] = 1 + hashmap.get(char, 0)
            
        maxHeap = [[-count, char] for char, count in hashmap.items() ] 
        
        heapq.heapify(maxHeap)
#         print(maxHeap)
        
        prev = None
    
        res = ""
        
        while maxHeap or prev:
            
            # a -> 1
            if prev and not maxHeap:
                return ""
            
            # most freq except prev
            count, char = heapq.heappop(maxHeap)
            res += char
            count += 1
            
            if prev:
                heapq.heappush(maxHeap, prev)
                prev = None
            
            if count < 0:
                prev = [count, char]
            
            
        
        return res