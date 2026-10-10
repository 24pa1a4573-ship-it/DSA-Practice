// Given an integer n, return the number of prime numbers that are strictly less than n.

class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1) return 0;
        int ans=0;
        boolean arr[] = new boolean[n];
        for(int i=2;i*i<n;i++){
            if(!arr[i]){
                for(int j=i*i;j<n;j+=i) arr[j]=true;  // j is starts from i*i becoz before multiples of j is marked by previous values of j.
            }
        }
        for(int i=2;i<n;i++) if(!arr[i]) ans++;
        return ans;
    }
}
