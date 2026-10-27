// Luntik came out for a morning stroll and found an array a
//  of length n
// . He calculated the sum s
//  of the elements of the array (s=∑ni=1ai
// ). Luntik calls a subsequence of the array a
//  nearly full if the sum of the numbers in that subsequence is equal to s−1
// .

// Luntik really wants to know the number of nearly full subsequences of the array a
// . But he needs to come home so he asks you to solve that problem!

// A sequence x
//  is a subsequence of a sequence y
//  if x
//  can be obtained from y
//  by deletion of several (possibly, zero or all) elements.

// Input
// The first line contains a single integer t
//  (1≤t≤1000
// ) — the number of test cases. The next 2⋅t
//  lines contain descriptions of test cases. The description of each test case consists of two lines.

// The first line of each test case contains a single integer n
//  (1≤n≤60
// ) — the length of the array.

// The second line contains n
//  integers a1,a2,…,an
//  (0≤ai≤109
// ) — the elements of the array a
// .

// Output
// For each test case print the number of nearly full subsequences of the array.


import java.util.*;
import java.lang.Math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long ones=0, zeros=0;
            for(int i=0;i<n;i++){
                int val=sc.nextInt();
                if(val==0) zeros++;
                else if(val==1) ones++;
            }
            System.out.println((long)Math.pow(2,zeros)*ones);
            
        }
        sc.close();
    }
}
