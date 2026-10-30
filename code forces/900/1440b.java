// A median of an array of integers of length n
//  is the number standing on the ⌈n2⌉
//  (rounding up) position in the non-decreasing ordering of its elements. Positions are numbered starting with 1
// . For example, a median of the array [2,6,4,1,3,5]
//  is equal to 3
// . There exist some other definitions of the median, but in this problem, we will use the described one.

// Given two integers n
//  and k
//  and non-decreasing array of nk
//  integers. Divide all numbers into k
//  arrays of size n
// , such that each number belongs to exactly one array.

// You want the sum of medians of all k
//  arrays to be the maximum possible. Find this maximum possible sum.

// Input
// The first line contains a single integer t
//  (1≤t≤100
// ) — the number of test cases. The next 2t
//  lines contain descriptions of test cases.

// The first line of the description of each test case contains two integers n
// , k
//  (1≤n,k≤1000
// ).

// The second line of the description of each test case contains nk
//  integers a1,a2,…,ank
//  (0≤ai≤109
// ) — given array. It is guaranteed that the array is non-decreasing: a1≤a2≤…≤ank
// .

// It is guaranteed that the sum of nk
//  for all test cases does not exceed 2⋅105
// .

// Output
// For each test case print a single integer — the maximum possible sum of medians of all k
//  arrays

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] arr = new int[n*x+1];
            for(int i=1;i<n*x+1;i++) arr[i]=sc.nextInt();
            int ind=n*x-((n)/2);
            long ans=0;
            for(int i=0;i<x;i++){
                ans+=arr[ind];
                ind-=n/2+1;
            }
            System.out.println(ans);
            
        }
        sc.close();
    }
}
