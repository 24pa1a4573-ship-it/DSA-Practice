// You are given an 2D array queries of dimension n*2.

// The queries[i] represents a range from queries[i][0] to queries[i][1] (include the end points).

// Return the count of prime numbers present in between each range in queries array.

class Solution {
    boolean isPrime[] = new boolean[100000+1];
    int countPrime[] = new int[100000+1];
    {
        isPrime[0]=true;            // to check primes in total.
        isPrime[1]=true;
        for(int i=2;i*i<100001;i++){
            if(!isPrime[i]){
                for(int j=i*i;j<100001;j+=i) isPrime[j]=true;
            }
        }

        for(int i=1;i<100000+1;i++){            // Prefix sum of number of primes till i.
            countPrime[i]=countPrime[i-1];
            if(!isPrime[i]) countPrime[i]=countPrime[i]+1;
        }
    }

    public ArrayList<Integer> primesInRange(ArrayList<int[]> queries) {
        //your code goes here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int[] a: queries){
            int left=countPrime[a[0]-1], right=countPrime[a[1]];   
            ans.add(right-left);
        }
        return ans;
    }
}
