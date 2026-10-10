class Solution {
    public int totalFruit(int[] fruits) {
        int ans=0;
        int n=fruits.length, i=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j=0;j<n;j++){
            map.put(fruits[j], map.getOrDefault(fruits[j],0)+1);
            if(map.size()>2){
                map.put(fruits[i], map.get(fruits[i])-1);
                if(map.get(fruits[i])==0) map.remove(fruits[i]);
                i++;
            }
            if(map.size()<=2) ans=Math.max(ans, j-i+1);
        }
        return ans;
    }
}
