// Given the head of a sorted doubly linked list of positive distinct integers, and a target integer, 
//   return a 2D array containing all unique pairs of nodes (a, b) such that a + b == target.

// Each pair should be returned as a 2-element array [a, b] with a < b. The list is sorted in ascending order. 
//   If there are no such pairs, return an empty list.

/*
class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
*/

class Solution {
    public ListNode findTail(ListNode head){
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.println(temp.val);
        return temp;
    }
    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
        // Your code goes here
        List<List<Integer>> ans = new ArrayList<>();
        ListNode left=head;
        ListNode right=findTail(head);
        while(left.val<right.val){
            if(left.val+right.val==target){
                List<Integer> li = new ArrayList<>();
                li.add(left.val);
                li.add(right.val);
                ans.add(li);
                left=left.next;
                right=right.prev;
            }
            else if(left.val+right.val<target) left=left.next;
            else right=right.prev;
        }
        return ans;
    }
}
