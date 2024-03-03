/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    int length=0;
    struct ListNode* curr=head;
    while(curr!=NULL){
        length++;
        curr=curr->next;
    }
    int end=length-n-1;
    curr=head;
    if(end==-1){
        head=head->next;
        free(curr);
        return head;
    }
    int i=0;
    while(i<end){
        curr=curr->next;
        i++;
    }
    struct ListNode* temp=curr->next;
    curr->next=curr->next->next;
    free(temp);
    return head;
}