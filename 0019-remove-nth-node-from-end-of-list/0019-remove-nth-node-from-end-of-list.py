# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        llength=self.length(head)
        end=llength-n-1
        if(end==-1):
            return head.next
        i=0
        curr=head
        while(i<end):
            curr=curr.next
            i+=1
        curr.next=curr.next.next
        return head
        
    
    
    
    def length(self,head):
        c=0
        if head is None:
            return c
        curr=head
        while curr is not None:
            c+=1
            curr=curr.next
        return c