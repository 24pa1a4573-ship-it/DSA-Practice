class Solution {
    public int priority(char ch){
        if(ch=='^') return 3;
        else if(ch=='*' || ch=='/') return 2;
        else if(ch=='+' || ch=='-') return 1;
        return 0;
    }
    public String infixToPostfix(String s) {
        // Your code goes here
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')) sb.append(ch);
            else if(ch=='(') st.push(ch);
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='(') sb.append(st.pop());
                if(!st.isEmpty()) st.pop();
            }
            else{
                while(!st.isEmpty() && priority(ch)<=priority(st.peek())) sb.append(st.pop());
                st.push(ch);
            }
        }
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.toString();
    }
}
