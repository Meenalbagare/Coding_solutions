/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        if(head==NULL){
            return false;
        }
        ListNode *l=head;
        ListNode *r=head;
        while(r!=NULL && r->next!=NULL){
            l=l->next;
            r=r->next->next;
            if(l==r){
                return true;
            }
        }
        return false;
    }
};

