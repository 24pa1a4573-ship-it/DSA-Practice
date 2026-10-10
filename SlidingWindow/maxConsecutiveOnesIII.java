class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int i=0, zero=0, n=nums.length;
        for(int j=0;j<n;j++){
            if(nums[j]==0) zero++;
            if(zero>k){
                if(nums[i]==0) zero--;
                i++;
            }
            if(zero<=k){
                ans=Math.max(ans, j-i+1);
            }
        }
        return ans;
    }
}
