class Solution {
    public int[] asteroidCollision(int[] arr) {
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0) st.push(arr[i]);
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(arr[i])) st.pop();
                if(!st.isEmpty() && st.peek()==Math.abs(arr[i])) st.pop();
                else if(st.isEmpty() || st.peek()<0) st.push(arr[i]);
            }
        }
        int[] fans = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--) fans[i]=st.pop();
        return fans;
    }
}
