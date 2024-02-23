class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        
        for string in strs:
            sorted_string = sorted(string)
            res[tuple(sorted_string)].append(string)
        return res.values()