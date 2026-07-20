class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] arr = new int[26];
        Arrays.fill(arr,0);
        for(int i:s.toCharArray()) arr[i-97]++;
        for(int i:t.toCharArray()) arr[i-97]--;
        for(int i=0;i<26;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}
