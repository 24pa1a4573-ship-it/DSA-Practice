class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(st.isEmpty()) continue;
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
                sb.append(' ');
            }
            else st.push(s.charAt(i));
        }
        while(!st.isEmpty()) sb.append(st.pop());
        if(sb.length()>0 && sb.charAt(sb.length()-1)==' ') sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
