class Solution {
    public int maxDepth(String s) {
        int max=0;
        int braket=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                braket++;
                if(braket>max) max=braket;

            }
            else if(c==')') braket--;
        }
        return max;
    }
}
