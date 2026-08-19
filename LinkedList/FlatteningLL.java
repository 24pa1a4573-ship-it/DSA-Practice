// Given a special linked list containing n head nodes where every node in the linked list contains two pointers:

// ‘Next’ points to the next node in the list
// ‘Child’ pointer to a linked list where the current node is the head
// Each of these child linked lists is in sorted order and connected by a 'child' pointer.

// Flatten this linked list such that all nodes appear in a single sorted layer connected by the 'child' pointer 
//   and return the head of the modified list.

/*Definition for singly Linked List
class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode next2) {
        val = data1;
        next = next1;
        child = next2;
    }
}
*/
class Solution {
    public ListNode flattenLinkedList(ListNode head) {
        ListNode ans=new ListNode(-1);
        ListNode fans=ans;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode temp=head;
        while(temp!=null){
            ListNode curr=temp;
            while(curr!=null){
                pq.add(curr.val);
                curr=curr.child;
            }
            temp=temp.next;
        }
        while(!pq.isEmpty()){
            ListNode value = new ListNode(pq.poll());
            ans.child=value;
            ans=ans.child;
        }
        return fans.child;
    }
}
