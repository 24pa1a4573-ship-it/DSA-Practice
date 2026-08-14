// Given the head of a singly linked list, find the length of the loop in the linked list if it exists.
//   Return the length of the loop if it exists; otherwise, return 0.

// A loop exists in a linked list if some node in the list can be reached again by continuously following the next pointer.
//   Internally, pos is used to denote the index (0-based) of the node from where the loop starts.

// Note that pos is not passed as a parameter.

/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode() {
        val = 0;
        next = null;
    }
    ListNode(int data1) {
        val = data1;
        next = null;
    }
    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */
 class Solution {
     public int findLengthOfLoop(ListNode head) {
        ListNode left=head;
        ListNode right=head;
        int count=1;
        while(right!=null && right.next!=null){    //To find is there is a loop or not.
            left=left.next;
            right=right.next.next;
            if(left==right){      // Have a Loop.
                right=right.next;
                while(left!=right){    //To count length of a loop. we increment left/right and move it untill both becomes equal.
                    count++;
                    right=right.next;
                }
                return count;
            }
        }
        return 0;
     }
 }
