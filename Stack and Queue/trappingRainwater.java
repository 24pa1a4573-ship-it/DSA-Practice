//I didn't know why this problem is asked related to queue, there is no queue required to solve this problem. 
//Maybe this can be given under two pointers problems, becoz I did this using 2 pointers lol....


class Solution {
    public int trap(int[] arr) {
        int lMax=0, rMax=0, total=0;
        int l=0, r=arr.length-1;
        while(l<r){
            if(arr[l]<=arr[r]){
                if(arr[l]<lMax){
                    total+=lMax-arr[l];
                }
                else lMax=arr[l];
                l++;
            }
            else{
                if(arr[r]<rMax) total+=rMax-arr[r];
                else rMax=arr[r];
                r--;
            }
        }
        return total;
    }
}
