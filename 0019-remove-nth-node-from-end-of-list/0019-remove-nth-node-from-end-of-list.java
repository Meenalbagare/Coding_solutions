/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        int length=length(head);
        int removenode=length-n;
        ListNode curr=dummy;
        if(head==null || head.next==null) return null;
        for(int i=0;i<removenode;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return dummy.next;
    }
    public int length(ListNode head){
        int c=0;
        ListNode curr=head;
        while(curr!=null){
            c+=1;
            curr=curr.next;
        }
        return c;
    }
}











