// Mainak has an array a1,a2,…,an
//  of n
//  positive integers. He will do the following operation to this array exactly once:

// Pick a subsegment of this array and cyclically rotate it by any amount.
// Formally, he can do the following exactly once:
// Pick two integers l
//  and r
// , such that 1≤l≤r≤n
// , and any positive integer k
// .
// Repeat this k
//  times: set al=al+1,al+1=al+2,…,ar−1=ar,ar=al
//  (all changes happen at the same time).
// Mainak wants to maximize the value of (an−a1)
//  after exactly one such operation. Determine the maximum value of (an−a1)
//  that he can obtain.

// Input
// Each test contains multiple test cases. The first line contains a single integer t
//  (1≤t≤50
// ) — the number of test cases. Description of the test cases follows.

// The first line of each test case contains a single integer n
//  (1≤n≤2000
// ).

// The second line of each test case contains n
//  integers a1,a2,…,an
//  (1≤ai≤999
// ).

// It is guaranteed that the sum of n
//  over all test cases does not exceed 2000
// .

// Output
// For each test case, output a single integer — the maximum value of (an−a1)
//  that Mainak can obtain by doing the operation exactly once

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans=Integer.MIN_VALUE;
            for(int i=1;i<n;i++){
                ans=Math.max(ans,arr[i]-arr[0]);
            }
            for(int i=n-2;i>=0;i--){
                ans=Math.max(ans,arr[n-1]-arr[i]);
            }
            for(int i=0;i<n-1;i++){
                ans=Math.max(ans,arr[i]-arr[i+1]);
            }
            System.out.println(ans==Integer.MIN_VALUE? 0: ans);
        }
    }
}
