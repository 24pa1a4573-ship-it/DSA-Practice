// Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
// The solution set must not contain duplicate subsets. Return the solution in any order.

// Example 1:
// Input: nums = [1,2,2]
// Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

class Solution {
    public void helper(int[] arr, int ind, List<List<Integer>> ans, List<Integer> l){
        ans.add(new ArrayList<>(l));
        if(ind==arr.length) return;
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;    // to skip duplicates.
            l.add(arr[i]);
            helper(arr,i+1,ans,l);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);                                  // To avoid duplicates we sort arr and if present, previous matches we skip.
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans, new ArrayList<>());
        return ans;
    }
}
