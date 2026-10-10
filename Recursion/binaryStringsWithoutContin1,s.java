// Given an integer n, return all binary strings of length n that
//   do not contain consecutive 1s. Return the result in lexicographically increasing order.
// A binary string is a string consisting only of characters '0' and '1'.
  
// Example 1
// Input: n = 3
// Output: ["000", "001", "010", "100", "101"]
// Explanation: All strings are of length 3 and do not contain consecutive 1s.

class Solution {
    public void helper(int n, String s, List<String> ans){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        helper(n, s+"0", ans);
        if(s.isEmpty() || s.charAt(s.length()-1)!='1'){
            helper(n,s+"1", ans);
        }
    }
    public List<String> generateBinaryStrings(int n) {
        // Your code goes here
        List<String> ans = new ArrayList<>();
        helper(n,"",ans);
        return ans;
    }
}
