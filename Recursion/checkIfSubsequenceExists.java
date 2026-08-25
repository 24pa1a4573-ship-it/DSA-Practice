//Given an array nums and an integer k. R﻿eturn true if there exist subsequences such that the sum of all elements in subsequences is equal to k else false.
// This gives only one subsequence and it is optimised to not going further recursion call after we get k as sum.
class Solution {
    public boolean helper(int[] arr, int k, int n, int ind, int sum){
        if(ind==n){
            if(sum==k) return true;
            return false;
        }
        if(helper(arr,k,n,ind+1,sum+arr[ind])==true) return true;
        if(helper(arr,k,n,ind+1,sum)==true) return true;
        return false;
    }
    public boolean checkSubsequenceSum(int[] nums, int k) {
         return helper(nums,k,nums.length,0,0);
    }
}
