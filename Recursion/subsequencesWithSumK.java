// Given an array nums and an integer k.Return the number of non-empty subsequences of nums 
//such that the sum of all elements in the subsequence is equal to k.

class Solution {
    public int helper(int[] arr, int n, int ind, int sum, int k) {
        if (ind == n) {
            return sum == k ? 1 : 0;
        }

        // Take current element
        int l = helper(arr, n, ind + 1, sum + arr[ind], k);

        // Don't take current element
        int r = helper(arr, n, ind + 1, sum, k);

        return l + r;
    }

    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        return helper(nums, nums.length, 0, 0, k);
    }
}
