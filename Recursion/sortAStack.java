// You are given a stack of integers. Your task is to sort the stack in descending order using recursion, 
//   such that the top of the stack contains the greatest element. You are not allowed to use any loop-based sorting methods (e.g., quicksort, mergesort). 
//   You may only use recursive operations and the standard stack operations (push, pop, peek/top, and isEmpty).

class Solution {
    public void insert(Stack<Integer> st, int temp){    // To put element in its correct position.
        if(st.isEmpty() || st.peek()<=temp){
            st.push(temp);
            return;
        }
        int val=st.pop();
        insert(st,temp);
        st.push(val);
    }
    public void sortStack(Stack<Integer> st) {    // To make stack empty and push elements one by one in correct positions.
        // Your code goes here
        if(st.isEmpty()) return;
        int temp=st.pop();
        sortStack(st);
        insert(st,temp);
    }
}
