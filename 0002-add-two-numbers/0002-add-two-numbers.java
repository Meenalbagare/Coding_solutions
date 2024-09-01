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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        int c=0;
        ListNode temp1=l1;
        ListNode temp2=l2;
        int d1,d2,d;
        int s=0;
        while(temp1!=null || temp2!=null){
            if(temp1!=null) {
                d1=temp1.val;
            } else{
                d1=0;
            }
            if(temp2!=null) {
                d2=temp2.val;
            } else{
                d2=0;
            }
            s=d1+d2+c;
            d=s%10;
            c=s/10;
            ListNode newN=new ListNode(d);
            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;
            curr.next=newN;
            curr=newN;
        }
        if(c!=0){
            ListNode newN=new ListNode(c);
            curr.next=newN;
        }
        return dummy.next;
    }
}