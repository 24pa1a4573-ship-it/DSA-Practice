class Solution {
    public int count(int[] arr, int k){
        int n=arr.length, sum=0, ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int j=0;j<n;j++){
            sum=sum+arr[j];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;  
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        boolean flag=true;
        if(goal==0){
            for(int x: nums){
                if(x!=0){
                    flag=false;
                    break;
                }
            }
            if(flag) return (nums.length*(nums.length+1))/2;
        }
        return count(nums, goal);
    }
}

//It is not an Optimal way but we can use this for smaller constraints.
