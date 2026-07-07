/* Approach: First I found the boundaries and use Binary Search to find answer.
  TC: O(N)*O(log maxValue)
  SC: O(1)
*/

class Solution {
    public long hours(int[] nums, int val){
        long hour=0;
        for(int x: nums){
            hour+=(x+val-1)/val;
        }
        return hour;
    }
    public int minimumRateToEatBananas(int[] nums, int h) {
        int max=0;
        for(int x: nums) if(x>max) max=x;
        if(nums.length==h) return max;
        int st=1, end=max;
        int ans=Integer.MAX_VALUE;
        while(st<=end){
            int mid=st+(end-st)/2;
            long NumHours=hours(nums,mid);
            if(NumHours<=h){
                ans=mid;
                end=mid-1;
            }
            else st=mid+1;
        }
        return ans;
    }
}
