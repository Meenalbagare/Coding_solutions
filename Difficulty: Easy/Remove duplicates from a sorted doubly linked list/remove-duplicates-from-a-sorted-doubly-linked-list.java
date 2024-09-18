//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader br;
    static PrintWriter ot;
    public static void main(String args[]) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);
        
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            Node head, tail;
            String s[] = br.readLine().trim().split(" ");
            int x = Integer.parseInt(s[0]);
            head = new Node(x);
            tail = head;
            for(int i = 1;  i < n; i++){
                x = Integer.parseInt(s[i]);
                Node temp = new Node(x);
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
            Solution soln = new Solution();
            head = soln.removeDuplicates(head);

            if(verify(head))
                displayList(head);
            else
                ot.println("Your pointers are not correctly connected");
            
        }
        ot.close();
    }
    static boolean verify(Node head){
        int fl = 0, bl = 0;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
            fl++;
        }
        while(temp.prev != null){
            temp = temp.prev;
            bl++;
        }
        return fl == bl;
    }
    static void displayList(Node head){
        while(head.next != null){
            ot.print(head.data + " ");
            head = head.next;
        }
        ot.println(head.data);
    }
}
class Node{
    int data;
    Node next, prev;
    Node(int x){
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    void remove(Node cur,Node prev){
        Node next = cur.next;  // Save reference to the next node
    
    prev.next = next;  // Link previous node to the next node
    if (next != null) {
        next.prev = prev;  // Link next node back to the previous node
    }
        
    }
    Node removeDuplicates(Node head){
        // Code Here.
        if (head == null || head.next == null) {
        return head;
    }

    Node curr = head.next;  // Start with the second node
    Node prev = head;  // Previous node starts at head

    while (curr != null) {
        if (curr.data == prev.data) {
            // Remove the duplicate node
            remove(curr, prev);
            // Move to the next node, which is now `prev.next`
            curr = prev.next;
        } else {
            // Move both pointers forward if no duplicate
            prev = curr;
            curr = curr.next;
        }
    }
        return head;
    }
}