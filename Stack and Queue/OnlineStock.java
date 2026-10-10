class StockSpanner {
    Stack<int[]> st = new Stack<>();
    int ind=0;

    public StockSpanner() {
        st=new Stack<>();
        ind=0;
    }

    public int next(int price) {
        while(!st.isEmpty() && st.peek()[0]<=price){
            st.pop();
        }
        int ans=0;
        if(st.isEmpty()) ans=ind+1;
        else{
            int[] pair = st.peek();
            ans=(ind)-pair[1];
        }
        st.push(new int[]{price, ind});
        ind++;
        return ans;
    }
}

