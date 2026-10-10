class Solution {
    public int maxScore(int[] arr, int k) {
        int lsum=0, rsum=0, ans=0;
        for(int i=0;i<k;i++) lsum+=arr[i];
        ans=lsum;
        int ind=arr.length-1;
        for(int i=k-1;i>=0;i--){
            lsum-=arr[i];
            rsum+=arr[ind--];
            ans=Math.max(lsum+rsum,ans);
        }
        return ans;
    }
}
