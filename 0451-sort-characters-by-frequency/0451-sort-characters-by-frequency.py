class Solution:
    def frequencySort(self, s: str) -> str:
        counter=Counter(s)
        max_heap=[(-freq,char) for char,freq in counter.items()]
        heapq.heapify(max_heap)
        result=""
        while max_heap:
            freq,char=heapq.heappop(max_heap)
            result+=char*(-freq)
        return result
        
        
        