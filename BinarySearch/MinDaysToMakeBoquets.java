/* Approach: Use Binary Search logic to find answer in search Space.
    TC:O(N*log(max-min value))
    SP:O(1)
*/

class Solution {
    public int numBouquets(int[] nums, int k, int mid){
        int count=0, ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mid) count=0;
            else count++;
            if(count==k){
                ans++;
                count=0;
            }
        }
        return ans;
    }
    public int roseGarden(int n, int[] nums, int k, int m) {
        if(n<k*m) return -1;
        int end=0, st=100000+1;
        int ans=0;
        for(int i: nums){
            if(i<st) st=i;
            if(i>end) end=i;
        }
        while(st<=end){
            int mid=st+(end-st)/2;
            int numOfBouquets=numBouquets(nums,k,mid);
            if(numOfBouquets>=m){
                ans=mid;
                end=mid-1;
            }
            else st=mid+1;
        }
        return ans;
    }
}
