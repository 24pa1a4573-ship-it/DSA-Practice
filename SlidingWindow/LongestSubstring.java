class Solution {
    public int kDistinctChar(String s, int k) {
        //your code goes here
        int ans=0;
        int i=0, n=s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int j=0;j<n;j++){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
            if(map.size()>k){
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0) map.remove(s.charAt(i));
                i++;
            }
            if(map.size()<=k){
                ans=Math.max(ans, j-i+1);
                System.out.println(ans);
                for(Map.Entry<Character, Integer> entry: map.entrySet())
                    System.out.println(entry.getKey()+" "+ entry.getValue());
            }
        }
        return ans;
    }
}
