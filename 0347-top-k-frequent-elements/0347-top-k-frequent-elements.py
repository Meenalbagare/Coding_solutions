class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        count={} #hashmap, key->count value:->num values matching the count
        freq=[[] for i in range(len(nums)+1)] # occurences
        for n in nums:
            count[n]=1+count.get(n,0)
        for n,c in count.items():
            freq[c].append(n)
       
        res=[]
        for i in range(len(freq)-1,0,-1):
            for n in freq[i]:
                res.append(n)
                if len(res)==k:
                    return res
            