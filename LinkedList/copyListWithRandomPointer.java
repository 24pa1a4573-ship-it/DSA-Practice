// Leetcode problem 138

// It have 3 steps,  make duplicates,  assign random to duplicates and make given list and copied list separated.

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public void makeCopy(Node head){    // To make copied node in between original nodes.
        Node temp=head;
        while(temp!=null){
            Node n = new Node(temp.val);
            n.next=temp.next;
            temp.next=n;
            temp=temp.next.next;
        }
    }
    public void randomAssign(Node head){    // To assign copied nodes random pointers.
        Node temp=head;
        while(temp!=null){
            if(temp.random!=null) temp.next.random=temp.random.next;
            temp=temp.next.next;
        }
    }
    public Node reorder(Node head){    // to make original and copied lists separated.
        Node dummy = new Node(-1);
        Node res=dummy;
        Node temp=head;
        while(temp!=null){
            res.next=temp.next;
            temp.next=temp.next.next;
            res=res.next;
            temp=temp.next;
        }
        return dummy.next;
    }
    public Node copyRandomList(Node head) {
        makeCopy(head);
        randomAssign(head);
        return reorder(head);
    }
}
