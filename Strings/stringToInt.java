class Solution {
    public int myAtoi(String s) {
        long ans=0;
        int sign=1;
        int n=s.length(), i=0;
        while(i<n && s.charAt(i)==' ') i++;
        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-') sign=-1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            ans=ans*10+(s.charAt(i)-'0');
            if(sign*ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign*ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)(sign*ans);
    }
}
