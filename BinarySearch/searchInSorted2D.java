class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length, n=matrix[0].length;
        int st=0, end=m*n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int val=matrix[mid/n][mid%n];
            if(val==target) return true;
            else if(val>target) end=mid-1;
            else st=mid+1;
        }
        return false;
    }
}
