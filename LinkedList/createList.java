// Given the head of a linked list, rotate the list to the right by k places.

// Input: head = [1,2,3,4,5], k = 2
// Output: [4,5,1,2,3]

// It is my own solution, we can get solution with easy than this in documentation.


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
    public int length(ListNode head){
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }
    public ListNode kPrevNode(ListNode head, int count){
        count--;
        ListNode temp=head;
        while(count>0 && temp!=null){
            count--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int len=length(head);
        k=k%len;
        if(k==0) return head;
        ListNode temp=head;
        ListNode prev=kPrevNode(head, len-k);
        ListNode front=prev.next;
        head=front;
        prev.next=null;
        while(front.next!=null){
            front=front.next;
        }
        front.next=temp;
        return head;
    }
}
