class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans=0;
        for(char c=0;c<s.length()-1;c++){
            int curr=map.get(s.charAt(c));
            int next=map.get(s.charAt(c+1));
            if(curr<next) ans-=curr;
            else ans+=curr;
        }
        ans+=map.get(s.charAt(s.length()-1));
        return ans;
    }
}
