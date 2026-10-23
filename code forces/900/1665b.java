// You are given an array a
//  of n
//  integers. Initially there is only one copy of the given array.

// You can do operations of two types:

// Choose any array and clone it. After that there is one more copy of the chosen array.
// Swap two elements from any two copies (maybe in the same copy) on any positions.
// You need to find the minimal number of operations needed to obtain a copy where all elements are equal.

// Input
// The input consists of multiple test cases. The first line contains a single integer t
//  (1≤t≤104
// ) — the number of test cases. Description of the test cases follows.

// The first line of each test case contains a single integer n
//  (1≤n≤105
// ) — the length of the array a
// .

// The second line of each test case contains n
//  integers a1,a2,…,an
//  (−109≤ai≤109
// ) — the elements of the array a
// .

// It is guaranteed that the sum of n
//  over all test cases does not exceed 105
// .

// Output
// For each test case output a single integer — the minimal number of operations needed to create at least one copy where all elements are equal

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int maxRepetitive=0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                int val=sc.nextInt();
                map.put(val,map.getOrDefault(val,0)+1);
                if(map.get(val)>maxRepetitive) maxRepetitive=map.get(val);
            }
            long ans=0;
            while(maxRepetitive<n){
                ans++;
                if(2*maxRepetitive<=n)
                    ans+=maxRepetitive;
                else 
                    ans=ans+(n-maxRepetitive);
                maxRepetitive*=2;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
