class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        group = {}
        
        for string in strs:
            sorted_string = sorted(string)
            if tuple(sorted_string) not in group:
                group[tuple(sorted_string)] = []
            
            group[tuple(sorted_string)].append(string)
            
            
        return group.values()