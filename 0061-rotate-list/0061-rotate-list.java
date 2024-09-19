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
    public ListNode findtail(ListNode head,int len){
        ListNode tem=head;
        for(int i=1;i<len;i++){
            tem=tem.next;
        }
        return tem;
    }
    public ListNode rotateRight(ListNode head, int k) {
        
        ListNode tail=head;
        int len=1;
        if(head==null || head.next==null) return head;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k%len==0) return head;
        k=k%len;
        tail.next=head;
        ListNode newtail=findtail(head,len-k);
        head=newtail.next;
        newtail.next=null;
        return head;
    }
}