// You are given an integer n
// . In one move, you can either multiply n
//  by two or divide n
//  by 6
//  (if it is divisible by 6
//  without the remainder).

// Your task is to find the minimum number of moves needed to obtain 1
//  from n
//  or determine if it's impossible to do that.

// You have to answer t
//  independent test cases.

// Input
// The first line of the input contains one integer t
//  (1≤t≤2⋅104
// ) — the number of test cases. Then t
//  test cases follow.

// The only line of the test case contains one integer n
//  (1≤n≤109
// ).

// Output
// For each test case, print the answer — the minimum number of moves needed to obtain 1
//  from n
//  if it's possible to do that or -1 if it's impossible to obtain 1
//  from n



import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long twosCount=0, threesCount=0;
            while(n>0 && n%3==0){
                n/=3;
                threesCount++;
            }
            while(n>0 && n%2==0){
                n/=2;
                twosCount++;
            }
            if(n>1 || twosCount>threesCount){
                System.out.println(-1);
            }
            else System.out.println(2*threesCount-twosCount);
        }
        sc.close();
    }
}
