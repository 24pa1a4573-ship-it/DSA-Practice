// It is given a positive integer n
// . In 1
//  move, one can select any single digit and remove it (i.e. one selects some position in the number and removes the digit located at this position). The operation cannot be performed if only one digit remains. If the resulting number contains leading zeroes, they are automatically removed.

// E.g. if one removes from the number 32925
//  the 3
// -rd digit, the resulting number will be 3225
// . If one removes from the number 20099050
//  the first digit, the resulting number will be 99050
//  (the 2
//  zeroes going next to the first digit are automatically removed).

// What is the minimum number of steps to get a number such that it is divisible by 25
//  and positive? It is guaranteed that, for each n
//  occurring in the input, the answer exists. It is guaranteed that the number n
//  has no leading zeros.

// Input
// The first line contains one integer t
//  (1≤t≤104
// ) — the number of test cases. Then t
//  test cases follow.

// Each test case consists of one line containing one integer n
//  (25≤n≤1018
// ). It is guaranteed that, for each n
//  occurring in the input, the answer exists. It is guaranteed that the number n
//  has no leading zeros.

// Output
// For each test case output on a separate line an integer k
//  (k≥0
// ) — the minimum number of steps to get a number such that it is divisible by 25
//  and positive

import java.util.*;
public class Main{
    public static long checker(long n, int tens, int ones){
        long ans=0;
        while(n>0 && n%10!=ones){
            n/=10;
            ans++;
        }
        n/=10;
        while(n>0 && n%10!=tens){
            ans++;
            n/=10;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long num=sc.nextLong();
            if(num/25==0) System.out.println(0);
            else{
                long ans=Long.MAX_VALUE;
                ans=Math.min(ans,checker(num,2,5));
                ans=Math.min(ans,checker(num,5,0));
                ans=Math.min(ans,checker(num,7,5));
                ans=Math.min(ans,checker(num,0,0));
                
                System.out.println(ans);
                
            }
        }
    }
}
