//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.


class Solution {
    public void helper(int n, int open, int close, String s, List<String> ans){
        if(open==n && close==n){
            ans.add(s);
            return;
        }
        if(open<n){
            helper(n,open+1, close, s+"(", ans);
        }
        if(close<open) helper(n,open, close+1, s+")", ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n, 0, 0, "", ans);
        return ans;
    }
}
