// Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

// The algorithm for myAtoi(string s) is as follows:

// Whitespace: Ignore any leading whitespace (" ").
// Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
// Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached.
//   If no digits were read, then the result is 0.
// Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. 
//   Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
// Return the integer as the final result.

// Can be implemented without recursion by using while loop in given function.

class Solution {
    public int helper(String s, int n, int i, int sign, long num){
        if(i>=n || !Character.isDigit(s.charAt(i))) return (int)num*sign;
        num=num*10+(s.charAt(i)-'0');
        if(sign*num>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(sign*num<=Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return helper(s,n,i+1,sign,num);
    }
    public int myAtoi(String s) {
        int sign=1, n=s.length(), i=0;
        long num=0;
        while(i<n && s.charAt(i)==' ') i++;
        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-') sign=-1;
            i++;
        }
        return helper(s, n, i, sign, num);
    }
}
