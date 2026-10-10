// Given an array of integers nums of unique elements. 
//   Return all possible subsets (power set) of the array.

// Do not include the duplicates in the answer.

// Example 1
// Input : nums = [1, 2, 3]
// Output : [ [ ] , [1] , [2] , [1, 2] , [3] , [1, 3] , [2, 3] , [1, 2 ,3] ]

class Solution {
    public void helper(int[] nums, List<List<Integer>> ans, List<Integer> curr, int ind){
        if(ind==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        helper(nums, ans, curr, ind+1);
        curr.add(nums[ind]);
        helper(nums, ans, curr, ind+1);
        curr.remove(curr.size()-1);

    }
    public List<List<Integer>> powerSet(int[] nums) {
        //your code goes here
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(nums, ans, curr,0);
        return ans;
    }
}
