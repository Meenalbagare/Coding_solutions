
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res=defaultdict(list)
        for i in strs:
            sorted_word=''.join(sorted(i))
            res[sorted_word].append(i)
        return list(res.values())