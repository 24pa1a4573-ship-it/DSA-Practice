// The problem which gives me motivation to solve untill it makes several days to complete.



class Solution {
    public int sumSubarrayMins(int[] arr) {
        long total=0;
        int n=arr.length, mod=1000000007;
        Stack<Integer> nse = new Stack<>();
        int[] nse_arr = new int[n];
        Stack<Integer> pse = new Stack<>();
        int[] pse_arr = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!nse.isEmpty() && arr[nse.peek()]>=arr[i]){
                nse.pop();
            }
            nse_arr[i]=(nse.isEmpty())? n: nse.peek();
            nse.push(i);
        }
        //while(!nse.isEmpty()) nse_arr[nse.pop()]=n;
        // for(int i=0;i<n;i++) System.out.print(nse_arr[i]+" ");
        for(int i=0;i<n;i++){
            while(!pse.isEmpty() && arr[pse.peek()]>arr[i]){
                pse.pop();
            }
            pse_arr[i]=(pse.isEmpty())? -1: pse.peek();
            pse.push(i);
        }
        //while(!pse.isEmpty()) pse_arr[pse.pop()]=-1;
        // System.out.println();
        // for(int i=0;i<n;i++) System.out.print(pse_arr[i]+" ");
        for(int i=0;i<n;i++){
            long left=i-pse_arr[i];
            long right=nse_arr[i]-i;
            total=(total+(left*right)%mod*1L*arr[i])%mod;
        }
        return (int)total;
    }
}
