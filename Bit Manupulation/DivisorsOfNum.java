//You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.

class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                arr.add(i);
                if(i!=n/i) arr.add(n/i);
            }
        }
        Collections.sort(arr);
        int[] ans = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}
