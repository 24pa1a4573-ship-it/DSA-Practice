// Given a string xof length nand a string sof length m(n⋅m≤25), consisting of lowercase Latin letters, you can apply any number of operations to the string x.

// In one operation, you append the current value of x
//  to the end of the string x
// . Note that the value of x
//  will change after this.

// For example, if x=
// "aba", then after applying operations, x
//  will change as follows: "aba" →
//  "abaaba" →
//  "abaabaabaaba".

// After what minimum number of operations s
//  will appear in x
//  as a substring? A substring of a string is defined as a contiguous segment of it.

// Input
// The first line of the input contains a single integer t
//  (1≤t≤104
// ) — the number of test cases.

// The first line of each test case contains two numbers n
//  and m
//  (1≤n⋅m≤25
// ) — the lengths of strings x
//  and s
// , respectively.

// The second line of each test case contains the string x
//  of length n.

// The third line of each test case contains the string s
//  of length m.

// Output
// For each test case, output a single number — the minimum number of operations after which s
//  will appear in x
//  as a substring. If this is not possible, output −1.


import java.util.*;
public class Main{
    public static boolean check(String x, String s){
        if(x.length()<s.length()) return false;
        for(int i=0;i<=x.length()-s.length();i++){
            if(x.substring(i, i+s.length()).equals(s)) return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            sc.nextLine();
            String x=sc.nextLine();
            String s=sc.nextLine();
            
            String x0=x;
            String x1=x0+x0;
            String x2=x1+x1;
            String x3=x2+x2;
            String x4=x3+x3;
            String x5=x4+x4;
            
            int ans=-1;
            
            if(check(x0,s)) ans=0;
            else if(check(x1,s)) ans=1;
            else if(check(x2,s)) ans=2;
            else if(check(x3,s)) ans=3;
            else if(check(x4,s)) ans=4;
            else if(check(x5,s)) ans=5;
            
            System.out.println(ans);
               
        }
    }
}
