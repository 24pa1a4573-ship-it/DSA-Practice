class Solution {
    public int max(int[][] mat, int m, int n, int mid){
        int ind=-1, maxValue=-1;
        for(int i=0;i<m;i++){
            if(maxValue<mat[i][mid]){
                maxValue=mat[i][mid];
                ind=i;
            }
        }
        return ind;
    }
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length, n=mat[0].length;
        int left=0, right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int rowInd=max(mat, m, n, mid);
            int leftInd=(mid-1>=0)? mat[rowInd][mid-1]: -1;
            int rightInd=(mid+1<=n-1)? mat[rowInd][mid+1]: -1;
            if(mat[rowInd][mid]>leftInd && mat[rowInd][mid]>rightInd) return new int[]{rowInd, mid};
            else if(mat[rowInd][mid]>leftInd) left=mid+1;
            else right=mid-1;
        }
        return new int[]{-1,-1};

    }
}
