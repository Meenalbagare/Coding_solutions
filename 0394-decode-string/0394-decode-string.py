class Solution(object):
    def decodeString(self, s):
        """
        :type s: str
        :rtype: str
        """
        stack=[]
        for i in range(len(s)):
            if s[i]!="]":
                stack.append(s[i])
            else:
                substr=""
                while stack[-1]!="[":
                    substr=stack.pop()+substr
                stack.pop()
                d=""
                while  stack and stack[-1].isdigit():
                    d=stack.pop()+d
                stack.append(int(d)*substr)
        return "".join(stack)
                