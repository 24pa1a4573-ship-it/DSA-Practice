class Solution {
    public static int maxValue(int[] nums,int max){
        int count=1, sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=max){
                sum+=nums[i];
            }
            else{
                count++;
                sum=nums[i];
            }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int left=0,right=0;
        for(int x: nums){
            if(left<x) left=x;
            right+=x;
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            int num=maxValue(nums,mid);
            if(num>k) left=mid+1;
            else right=mid-1;
        }
        return left;
    }
    
}
