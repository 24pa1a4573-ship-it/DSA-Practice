// You are given a permutation p1,p2,…,pn
// . Recall that sequence of n
//  integers is called a permutation if it contains all integers from 1
//  to n
//  exactly once.

// Find three indices i
// , j
//  and k
//  such that:

// 1≤i<j<k≤n
// ;
// pi<pj
//  and pj>pk
// .
// Or say that there are no such indices.
// Input
// The first line contains a single integer T
//  (1≤T≤200
// ) — the number of test cases.

// Next 2T
//  lines contain test cases — two lines per test case. The first line of each test case contains the single integer n
//  (3≤n≤1000
// ) — the length of the permutation p
// .

// The second line contains n
//  integers p1,p2,…,pn
//  (1≤pi≤n
// ; pi≠pj
//  if i≠j
// ) — the permutation p
// .

// Output
// For each test case:

// if there are such indices i
// , j
//  and k
// , print YES (case insensitive) and the indices themselves;
// if there are no such indices, print NO (case insensitive).
// If there are multiple valid triples of indices, print any of the


import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int ind1=-1, ind2=-1, ind3=-1;
            for(int i=1;i<n-1;i++){
                ind2=i;
                for(int j=i-1;j>=0;j--){
                    if(arr[j]<arr[i]) ind1=j;
                }
                for(int k=i+1;k<n;k++){
                    if(arr[k]<arr[i]) ind3=k;
                }
                if(ind1==-1 || ind3==-1){
                    ind1=-1;
                    ind2=-1;
                    ind3=-1;
                }
                else break;
            }
            if(ind1!=-1){
                System.out.println("YES");
                System.out.println((ind1+1)+" "+(ind2+1)+" "+(ind3+1));
            }
            else System.out.println("NO");
        }
    }
}
