// Given two strings s and t of lengths m and n respectively, 
//   return the minimum window substring of s such that every character in t (including duplicates) 
//   is included in the window. If there is no such substring, return the empty string "".



class Solution {
    public String minWindow(String s, String t) {
        int s_len=s.length(), t_len=t.length();
        if(t_len>s_len) return "";
        HashMap<Character, Integer> t_map = new HashMap<>();
        for(int i=0;i<t_len;i++){
            t_map.put(t.charAt(i), t_map.getOrDefault(t.charAt(i),0)+1);
        }
        int stInd=-1, i=0, count=0, minLen=Integer.MAX_VALUE, k=t_map.size();
        for(int j=0;j<s_len;j++){
            char ch = s.charAt(j);
            if(t_map.containsKey(ch)){
                t_map.put(ch, t_map.get(ch)-1);
                if(t_map.get(ch)==0) count++;
            }
            while(count==k){
                if(minLen>j-i+1){
                    minLen=j-i+1;
                    stInd=i;
                }
                if(t_map.containsKey(s.charAt(i))) {
                    t_map.put(s.charAt(i), t_map.get(s.charAt(i)) + 1);
                    if(t_map.get(s.charAt(i)) > 0) count = count - 1;
                }
                i++;
            }
            
        }
        return stInd==-1? "": s.substring(stInd, stInd+minLen);
    }
}
