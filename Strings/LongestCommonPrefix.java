class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String shortWord=strs[0];
        for(int i=1;i<strs.length;i++){
            if(strs[i].equals("")) return "";
            if(shortWord.length()>strs[i].length()) shortWord=strs[i];
        }
        int ind=0;
        for(char l: shortWord.toCharArray()){
            for(int i=0;i<strs.length;i++){
                if(strs[i].charAt(ind)!=l) return sb.toString();
            }
            ind++;
            sb.append(l);
        }
        return sb.toString();
    }
}
