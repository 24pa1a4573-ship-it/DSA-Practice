// Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

// Only numbers 1 through 9 are used.
// Each number is used at most once.
// Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.


class Solution {
    public void helper(int[] nums, int k, int n, int i, List<List<Integer>> ans, List<Integer> l) {
        if (n == 0 && l.size() == k) {
            ans.add(new ArrayList<>(l));
            return;
        }
        if (n < 0 || i == 9 || l.size() > k)
            return;
        l.add(nums[i]);
        helper(nums, k, n - nums[i], i + 1, ans, l);
        l.remove(l.size() - 1);
        helper(nums, k, n, i + 1, ans, l);

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, k, n, 0, ans, new ArrayList<>());
        return ans;
    }
}
