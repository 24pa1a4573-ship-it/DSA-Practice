// Given an array a
//  of length n
// , containing integers. And there are two initially empty arrays b
//  and c
// . You need to add each element of array a
//  to exactly one of the arrays b
//  or c
// , in order to satisfy the following conditions:

// Both arrays b
//  and c
//  are non-empty. More formally, let lb
//  be the length of array b
// , and lc
//  be the length of array c
// . Then lb,lc≥1
// .
// For any two indices i
//  and j
//  (1≤i≤lb,1≤j≤lc
// ), cj
//  is not a divisor of bi
// .
// Output the arrays b
//  and c
//  that can be obtained, or output −1
//  if they do not exist.

// Input
// Each test consists of multiple test cases. The first line contains a single integer t
//  (1≤t≤500
// ) — the number of test cases. The description of the test cases follows.

// The first line of each test case contains a single integer n
//  (2≤n≤100
// ) — the length of array a
// .

// The second line of each test case contains n
//  integers a1,a2,…,an
//  (1≤ai≤109
// ) — the elements of array a
// .

// Output
// For each test case, output a single integer −1
//  if a solution does not exist.

// Otherwise, in the first line, output two integers lb
//  and lc
//  — the lengths of arrays b
//  and c
//  respectively.

// In the second line, output lb
//  integers b1,b2,…,blb
//  — the elements of array b
// .

// In the third line, output lc
//  integers c1,c2,…,clc
//  — the elements of array c
// .

// If there are multiple solutions, output any of them. You can output the elements of the arrays in any order.


import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            Arrays.sort(arr);
            if(arr[0]==arr[n-1]) System.out.println(-1);
            else{
                ArrayList<Integer> b = new ArrayList<>();
                ArrayList<Integer> c = new ArrayList<>();
                b.add(arr[0]);
                int i=1;
                while(i<n && arr[i]==arr[i-1]){
                    b.add(arr[i]);
                    i++;
                }
                while(i<n){
                    c.add(arr[i]);
                    i++;
                }
                
                if(b.size()<1 || c.size()<1) System.out.println(-1);
                else{
                    System.out.println(b.size()+" "+c.size());
                    for(int a: b) System.out.print(a+" ");
                    System.out.println();
                    for(int a: c) System.out.print(a+" ");
                    System.out.println();
                    
                }
                
            }
            
            
        }
        
    }
}
