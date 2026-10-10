// This problem helps me to figure out small Observations can make the solution more Better and Short.

class Solution {
    public int numberOfSubstrings(String s) {
        int[] a ={-1,-1,-1};
        int ans=0;
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']=i;
            ans+=(1+Math.min(Math.min(a[0],a[1]),a[2]));
        }
        return ans;
    }
}
