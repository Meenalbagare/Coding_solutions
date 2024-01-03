class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        dictionary=defaultdict(list)
        for word in strs:
            count=[0]*26
            for char in word:
                count[ord(char)-ord("a")]+=1
            dictionary[tuple(count)].append(word)
        return dictionary.values()