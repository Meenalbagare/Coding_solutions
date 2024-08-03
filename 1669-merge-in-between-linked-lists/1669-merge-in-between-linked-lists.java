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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
       
        ListNode cur=list1;
        int i=0;
        while(i<a-1){
            cur=cur.next;
            i++;
        }
        //add list2 here
        ListNode head2=list2;
        ListNode rear=cur;
        
        while(i<b+1){
            rear=rear.next;
            i++;
        }
        cur.next=head2;
        while(cur.next!=null){
            cur=cur.next;
        }
        // System.out.println(rear.val);
        cur.next=rear;
        return list1;
    }
}