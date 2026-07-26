class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans =new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<2*n;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i%n]){
                ans[st.pop()]=nums[i%n];
            }
            if(i<n) st.push(i%n);
        }
        while(!st.isEmpty()) ans[st.pop()]=-1;
        return ans;
    }
}
