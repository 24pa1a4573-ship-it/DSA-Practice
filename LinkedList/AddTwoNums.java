// You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order, and each of their nodes contains a single digit.
// Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

// Input: l1 = [2,4,3], l2 = [5,6,4]   
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.

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
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode dummy = new ListNode(-1);
        ListNode temp=dummy;
        int carry=0;
        while(t1!=null || t2!=null || carry!=0){
            int sum=0;
            if(t1!=null){
                sum=sum+t1.val;
                t1=t1.next;
            }
            if(t2!=null){
                sum=sum+t2.val;
                t2=t2.next;
            }
            sum=sum+carry;
            carry=sum/10;
            ListNode node = new ListNode(sum%10);
            temp.next=node;
            temp=node;
        }
        return dummy.next;
    }
}
