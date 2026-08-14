//Given the head of a linked list, remove the nth node from the end of the list and return its head.

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to seamlessly handle edge cases (e.g., removing the head node)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        // Move the fast pointer n steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // Move both pointers simultaneously until the fast pointer reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // Skip the N-th node from the end
        slow.next = slow.next.next;
        
        // Return the actual head of the list
        return dummy.next;
    }
}
