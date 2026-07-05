/* Approach: Using HashMap to know target-present array value is present so far in traversed Array.
   TC:O(N) for traversing array.
   SP:O(N) for hashmap.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int val=target-nums[i];
            if(map.containsKey(val)){
                ans[0]=map.get(val);
                ans[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
