class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k) return "0";
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k>0 && st.peek()-'0'>num.charAt(i)-'0'){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
        while(!st.isEmpty()){
            sb.append(st.pop()-'0');
        }
        while(sb.length()!=0 && sb.charAt(sb.length()-1)=='0') sb.deleteCharAt(sb.length()-1);
        sb.reverse();
        if(sb.length()==0) return "0";
        return sb.toString();
    }
}
