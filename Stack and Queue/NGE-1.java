class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length, n2=nums2.length;
        int[] ans = new int[n1];
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n2;i++){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                map.put(st.peek(), nums2[i]);
                st.pop();
            }
            st.push(nums2[i]);
        }
        while(!st.isEmpty()) map.put(st.pop(), -1);
        for(int i=0;i<n1;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}
