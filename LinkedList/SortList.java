// Given the head of a linked list, return the list after sorting it in ascending order.



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
    public ListNode mid(ListNode head){      // To find middle element, if two middle elements have return left node, thats why right=head.next
        ListNode left=head, right=head.next;
        while(right!=null && right.next!=null){
            left=left.next;
            right=right.next.next;
        }
        return left;
    }
    public ListNode merge(ListNode left, ListNode right){    // To merge two sorted arrays using dummy node.
        ListNode dummy = new ListNode(-1);
        ListNode temp=dummy;
        while(left!=null && right!=null){
            if(left.val>right.val){
                temp.next=right;
                temp=right;
                right=right.next;
            }
            else{
                temp.next=left;
                temp=left;
                left=left.next;
            }
        }
        if(left!=null) temp.next=left;
        else temp.next=right;

        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode middle = mid(head);
        ListNode rightNode = middle.next;
        middle.next=null;
        ListNode leftNode=head;
        ListNode left=sortList(leftNode);      // to sort values.
        ListNode right=sortList(rightNode);
        return merge(left, right);
    }
}
