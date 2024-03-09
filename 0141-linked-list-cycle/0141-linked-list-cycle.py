# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head==None:
            return False
        l=head
        r=head
        while(r is not None and r.next is not None):
            l=l.next
            r=r.next.next
            if(l==r):
                return True
        return False