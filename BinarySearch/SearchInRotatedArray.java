/* Using binary Search Algo and some basic maths logic's.
  TC:O(logN)
  SP:O(1)
*/

class Solution {
    public int search(int[] nums, int k) {
       int st=0, end=nums.length-1;
       while(st<=end){
        int mid=st+(end-st)/2;
        if(nums[mid]==k) return mid;
        else if(nums[mid]>nums[st]){
            if(k<nums[mid] && k>=nums[st]) end=mid-1;
            else st=mid+1;
        }
        else{
            if(k<=nums[end]&&k>nums[mid]) st=mid+1;
            else end=mid-1;
        }
       }
       return -1;
    }
}
