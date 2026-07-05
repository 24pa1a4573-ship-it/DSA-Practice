/* Approach: Using Binary Search and Find which side have minimum elements to get min value in array.
  TC: O(log N)
  SP:O(1)
*/

class Solution {
    public int findMin(int[] nums) {
        int ans=nums[0];
        int st=0, end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]<ans) ans=nums[mid];
            if(nums[mid]>nums[st]){
                if(nums[st]<ans) end=mid-1;
                else st=mid+1;
            }
            else{
                if(nums[end]<ans) st=mid+1;
                else end=mid-1;
            }
        }
        return ans;
    }
}
