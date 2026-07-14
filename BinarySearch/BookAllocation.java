class Solution {
    public int numPersons(int[] nums, int m, int numPages){
        int count=0, sum=0;
        for(int x: nums){
        for(int x: nums){
            sum+=x;
            if(sum+>=numPages){
                count++;
                sum=0;
            }
        }
        return count;
    }
    public int findPages(int[] nums, int m) {
        int right=0;
        for(int x: nums) right+=x;
        Arrays.sort(nums);
        int left=nums[0];
        while(left<=right){
            int mid=left+(right-left)/2;
            if(numPersons(nums,m,mid)==m) left=mid+1;
            else right=mid-1;
        }
        return right;
    }
}
