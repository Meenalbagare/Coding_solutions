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
        int linkedlen=length(head);
        ListNode curr=head;
        int end=linkedlen-n-1;
        if( end==-1) return head.next;
        int i=0;
        while(i<end){
            curr=curr.next;
            i++;
        }
        curr.next=curr.next.next;
        return head;
    }
    public int length(ListNode head){
        int c=0;
        if(head==null) return c;
        ListNode curr=head;
        while(curr!=null){
            c+=1;
            curr=curr.next;
        }
        return c;
    }
}