class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] s_array=new int[256];
        int[] t_array=new int[256];
        for(char i=0;i<s.length();i++){
            if(s_array[s.charAt(i)]!=t_array[t.charAt(i)]) return false;
            s_array[s.charAt(i)]=i+1;
            t_array[t.charAt(i)]=i+1;
            
        }
        return true;
    }
}
