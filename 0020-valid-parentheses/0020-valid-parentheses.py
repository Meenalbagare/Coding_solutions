class Solution:
    def isValid(self, s: str) -> bool:
        stck=[]
        hashset={")":"(","}":"{","]":"["}
        for i in s:
            if i in hashset:
                if stck and stck[-1]==hashset[i]:
                    stck.pop()
                else:
                    return False
            else:
                stck.append(i)
        if not stck:
            return True
        else:
            return False