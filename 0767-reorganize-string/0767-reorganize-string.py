class Solution:
    def reorganizeString(self, s: str) -> str:
        hashmap = {}
        
        for char in s:
            hashmap[char] = 1 + hashmap.get(char, 0)
            
        maxHeap = [[-count, char] for char, count in hashmap.items()]
        
        heapq.heapify(maxHeap)
        
        res = ""
        pre = None
        
        while maxHeap or pre:
            if pre and not maxHeap:
                return ""
            
            
            # get most frequence
            count, char = heapq.heappop(maxHeap)
            count += 1
            res += char
            
            # if pre is not null, mean it's storing the most fre char
            # return it back to the heap and empty pre
            if pre:
                heapq.heappush(maxHeap, pre)
                pre = None
            
            
            # hide the most frequent char inside pre
            if count != 0:
                pre = [count, char]
                
        return res