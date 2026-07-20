class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character, Integer>> ls = new ArrayList<>(map.entrySet());
        Collections.sort(ls,(a,b)-> b.getValue()-a.getValue());
        for(Map.Entry<Character,Integer> entry: ls){
            for(int i=0;i<entry.getValue();i++) sb.append(entry.getKey());

        }
        return sb.toString();

    }
}
