/* Approach: Using Binary Search to Optimise log N.
  TC: O(log n)
  SP: O(1)
*/


class Solution {
    public int floorSqrt(int n) {
      if(n<2) return n;
      int ans=1;
      int st=1, end=n/2;
      while(st<=end){
        int mid=st+(end-st)/2;
        if(mid<=n/mid) {
            ans=mid;
            st=mid+1;
        }
        else end=mid-1;
      }
      return ans;
    }
}
