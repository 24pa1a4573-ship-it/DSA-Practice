// Given an array of distinct integers candidates and a target integer target, 
//   return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from candidates an unlimited number of times. 
//   Two combinations are unique if the frequency of at least one of the chosen numbers is different.

// The test cases are generated such that the number of unique combinations 
//   that sum up to target is less than 150 combinations for the given input.


class Solution {
    public void helper(int[] arr, int target, int n, int sum, int ind, List<List<Integer>> ans, List<Integer> l) {
        if (sum == target) {
            ans.add(new ArrayList<>(l));
            return;
        }
        if (ind == n || sum > target) {
            return;
        }
        l.add(arr[ind]);
        helper(arr, target, n, sum + arr[ind], ind, ans, l);
        l.remove(l.size() - 1);
        helper(arr, target, n, sum, ind + 1, ans, l);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        helper(candidates, target, candidates.length, 0, 0, ans, l);
        return ans;
    }
}
