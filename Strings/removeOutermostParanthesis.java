class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth=0;
        for(int ch: s.toCharArray()){
            if(ch=='('){
                if(depth>0) sb.append('(');
                depth++;
            }
            else{
                depth--;
                if(depth>0) sb.append(')');
            }
        }
        return sb.toString();
    }
}
