// Given an array of integers nums. Check whether the array represents a binary min-heap or not. Return true if it does, otherwise return false.

// A binary min-heap is a complete binary tree where the key at the root is the minimum among all keys present in a binary min-heap and the same property is recursively true for all nodes in a Binary Tree.

// Example 1
// Input: nums = [10, 20, 30, 21, 23]
// Output: true
// Explanation: Each node has a lower or equal value than its children.

// Example 2
// Input: nums = [10, 20, 30, 25, 15]
// Output: false
// Explanation: The node with value 20 has a child with value 15, thus it is not a min-heap.

class Solution {
    public boolean isHeap(int[] nums) {
        for(int i=0;i<nums.length/2;i++){
            if(nums[i]>nums[2*i+1] || nums[i]>nums[2*i+2]) return false;
        }
        return true;
    }
}

// Note: children are 2*i+1, 2*i+2.
//        After n/2-1 indices all are child nodes in binary min Heap.
