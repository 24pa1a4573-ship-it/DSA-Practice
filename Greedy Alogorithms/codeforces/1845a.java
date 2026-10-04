// You are given an integer n
// , which you want to obtain. You have an unlimited supply of every integer from 1
//  to k
// , except integer x
//  (there are no integer x
//  at all).

// You are allowed to take an arbitrary amount of each of these integers (possibly, zero). Can you make the sum of taken integers equal to n
// ?

// If there are multiple answers, print any of them.

// Input
// The first line contains a single integer t
//  (1≤t≤100
// ) — the number of testcases.

// The only line of each testcase contains three integers n,k
//  and x
//  (1≤x≤k≤n≤100
// ).

// Output
// For each test case, in the first line, print "YES" or "NO" — whether you can take an arbitrary amount of each integer from 1
//  to k
// , except integer x
// , so that their sum is equal to n
// .

// If you can, the second line should contain a single integer m
//  — the total amount of taken integers. The third line should contain m
//  integers — each of them from 1
//  to k
// , not equal to x
// , and their sum is n
// .

// If there are multiple answers, print any of them.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            if(x!=1){
                System.out.println("YES");
                System.out.println(n);
                for(int i=0;i<n;i++) System.out.print(1+" ");
                System.out.println();
            }
            else{
                if(k==1 || n==1) System.out.println("NO");
                else if(k==2){
                    if(n%2==1) System.out.println("NO");
                    else{
                        System.out.println("YES");
                        System.out.println(n/2);
                        for(int i=0;i<n/2;i++) System.out.print(2+" ");
                        System.out.println();
                    }
                }
                else{
                    System.out.println("YES");
                    System.out.println(n/2);
                    if(n%2==0){
                        for(int i=0;i<n/2;i++) System.out.print(2+" ");
                        System.out.println();
                    }
                    else{
                        for(int i=0;i<n/2-1;i++) System.out.print(2+" ");
                        System.out.print(3);
                        System.out.println();
                    }
                }
            }
        }
    }
}
