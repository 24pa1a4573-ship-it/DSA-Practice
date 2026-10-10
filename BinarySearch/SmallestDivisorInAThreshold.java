class Solution {
    public int divisorSum(int[] nums, int divisor){
        int sum=0;
        for(int x: nums) sum+=(x+divisor-1)/divisor;
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
       int ans=0;
       int st=1, end=0;
       for(int x: nums) if(x>end) end=x;
       while(st<=end){
        int mid=st+(end-st)/2;
        int sumOfDivisors=divisorSum(nums,mid);
        if(sumOfDivisors<=threshold){
            ans=mid;
            end=mid-1;
        }
        else st=mid+1;
       }
       return ans;
    }
}
