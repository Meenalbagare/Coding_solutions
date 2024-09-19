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
    public ListNode getkth(ListNode temp,int k){
        for(int i=1;i<k && temp!=null;i++){
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode temp){
        ListNode next;
        ListNode curr=temp;
        ListNode prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        ListNode next;
        while(temp!=null){
            ListNode kthnode=getkth(temp,k);
            if(kthnode==null) {
                if(prev!=null) prev.next=temp;
                break;
            } else{
                 next=kthnode.next;
                 kthnode.next=null;
                 reverse(temp);
                if(temp==head){
                    head=kthnode;
                } else{
                    prev.next=kthnode;
                }
                prev=temp;
                temp=next;
            }
        }
        return head;
    }
}