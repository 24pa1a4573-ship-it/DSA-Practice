//Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

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
    public ListNode reverse(ListNode head){
        ListNode prev=null, temp=head, front=head;
        while(temp!=null){
            front=front.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode left=head;
        ListNode right=head;
        while(right.next!=null && right.next.next!=null){
            left=left.next;
            right=right.next.next;
        }
        ListNode newHead=reverse(left.next);   // here left is middle node.
        left=head;
        right=newHead;
        while(right!=null){
            if(left.val!=right.val){
                reverse(newHead);
                return false;
            }
            left=left.next;
            right=right.next;
        }
        reverse(newHead);    // we reverse the list to its original format. Because we avoid manupulate the original data.
        return true;
    }
}
