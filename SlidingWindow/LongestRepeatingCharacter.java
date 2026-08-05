class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0, maxFre=0, n=s.length();
        for(int j=0;j<n;j++){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
            maxFre=Math.max(maxFre, map.get(s.charAt(j)));
            if((j-i+1)-maxFre>k){
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0) map.remove(s.charAt(i));
                else maxFre=Math.max(maxFre, map.get(s.charAt(i)));
                i++;
            }
            if((j-i+1)-maxFre<=k) ans=Math.max(ans, j-i+1);
        }
        return ans;
    }
}
