/* Approach: Eleminating half side based on left side of mid less than mid, then eleminate left otherwise right.
    TC: O(log n)
    SP: O(1)
  This is my first code which I got accepted in Leetcode, if seems like some difficult and I then saw the Optimised version of the code then I realise
  some conditions in my code is not even necessary. A problem which help me a lot to understand deeper thinking. */

class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int st=0, end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) return mid;
            if(mid>0 && mid<n-1){
                if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) st=mid+1;
                else end=mid-1;
            }
            else if(st==0) return 1;
            else return n-1;
        }
        return -1;
    }
}
