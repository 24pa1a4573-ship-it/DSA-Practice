class Solution {
    public int count(int[] arr, int k){
        if(k<=0) return 0;
        int ans=0;
        int i=0, n=arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j=0;j<n;j++){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            while(map.size()>k){
                map.put(arr[i], map.get(arr[i])-1);
                if(map.get(arr[i])==0) map.remove(arr[i]);
                i++;
            }
            if(map.size()<=k) ans+=(j-i+1);
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return count(nums,k)-count(nums,k-1);
    }
}
