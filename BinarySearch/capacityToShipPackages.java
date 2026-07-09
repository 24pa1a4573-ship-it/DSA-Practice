/* Approach: using Binary Search to find optimal value by using monotonic property.
    TC:O(log(max-min)*n)
    SP:O(1)
*/

lass Solution {
    public int numOfDays(int[] weights, int maxWeight){
        int count=0,sum=0;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]>maxWeight){
                count++;
                sum=0;
            }
            sum+=weights[i];
        }
        return count+1;
    }
    public int shipWithinDays(int[] weights, int days) {
        int ans=0;
        int st=0,end=0;
        for(int x: weights){
            end+=x;
            st=Math.max(st,x);
        }
        if(days==1) return end;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(numOfDays(weights,mid)<=days){
                end=mid-1;
                ans=mid;
            }
            else st=mid+1;
        }
        return ans;
    }
}
