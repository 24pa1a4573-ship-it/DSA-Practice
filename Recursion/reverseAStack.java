// You are given a stack of integers. Your task is to reverse the stack using recursion.
//   You may only use standard stack operations (push, pop, top/peek, isEmpty). 
//   You are not allowed to use any loop constructs or additional data structures like arrays or queues.

// Your solution must modify the input stack in-place to reverse the order of its elements.

class Solution {
    public void rever(Stack<Integer> st, int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int temp=st.pop();
        rever(st, val);
        st.push(temp);
    }
    public void reverseStack(Stack<Integer> st) {
        // Your code goes here
        if(st.isEmpty()) return;
        int val=st.pop();
        reverseStack(st);
        rever(st, val);
        
    }
}
