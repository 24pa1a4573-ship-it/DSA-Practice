class Solution {
    public int findKthPositive(int[] arr, int k) {
       int st=0,end=arr.length-1;
       while(st<=end){
        int mid=st+(end-st)/2;
        if(arr[mid]-(mid+1)>=k){
            end=mid-1;
        }
        else st=mid+1;
       }
       return st+k;
    }
}
