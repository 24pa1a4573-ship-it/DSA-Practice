class MinStack {
    Stack<int[]> st;
    int min=Integer.MAX_VALUE;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int value) {
        if(st.isEmpty()) st.push(new int[]{value,value});
        else{
            int[] arr = st.peek();
            st.push(new int[]{value, Math.min(value, arr[1])});
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        int[] arr = st.peek();
        return arr[0];
    }
    
    public int getMin() {
        int[] arr = st.peek();
        return arr[1];
    }
}
