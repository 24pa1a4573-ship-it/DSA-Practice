class Solution {
    public int count(int[] arr, int k){
        if(k<0) return 0;
        int ans=0;
        int i=0, n=arr.length, sum=0;
        for(int j=0;j<n;j++){
            sum+=arr[j]%2;
            while(sum>k){
                sum-=arr[i]%2;
                i++;
            }
            ans+=(j-i+1);
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return count(nums,k)-count(nums,k-1);
    }
}
