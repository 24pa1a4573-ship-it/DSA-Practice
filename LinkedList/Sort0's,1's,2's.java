//Given the head of a singly linked list consisting of only 0, 1 or 2.
//Sort the given linked list and return the head of the modified list.
//Do it in-place by changing the links between the nodes without creating new nodes.


/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode sortList(ListNode head) {
        //YOUR CODE GOES HERE
        if(head==null || head.next==null) return head;

        ListNode zeroHead = new ListNode(-1);    // To track zero's first node.
        ListNode oneHead = new ListNode(-1);      // To track one's first node.
        ListNode twoHead = new ListNode(-1);      // To track two's first node.

        ListNode zero = zeroHead;
        ListNode one = oneHead;
        ListNode two = twoHead;

        ListNode temp = head;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=temp;
            }
            else if(temp.data==1){
                one.next=temp;
                one=temp;
            }
            else{
                two.next=temp;
                two=temp;
            }
            temp=temp.next;
        }
        
        zero.next=(oneHead.next==null)? twoHead.next: oneHead.next;    // To link with ones or twos.
        one.next=twoHead.next;    // To link with twos if present.
        two.next=null;    // After all twos it is always null.

        return zeroHead.next;    // gives head or first node of zeros/ones/twos.
    }
}
