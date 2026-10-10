// You are the author of a Codeforces round and have prepared n
//  problems you are going to set, problem i
//  having difficulty ai
// . You will do the following process:

// remove some (possibly zero) problems from the list;
// rearrange the remaining problems in any order you wish.
// A round is considered balanced if and only if the absolute difference between the difficulty of any two consecutive problems is at most k
//  (less or equal than k
// ).

// What is the minimum number of problems you have to remove so that an arrangement of problems is balanced?

// Input
// The first line contains a single integer t
//  (1≤t≤1000
// ) — the number of test cases.

// The first line of each test case contains two positive integers n
//  (1≤n≤2⋅105
// ) and k
//  (1≤k≤109
// ) — the number of problems, and the maximum allowed absolute difference between consecutive problems.

// The second line of each test case contains n
//  space-separated integers ai
//  (1≤ai≤109
// ) — the difficulty of each problem.

// Note that the sum of n
//  over all test cases doesn't exceed 2⋅105
// .

// Output
// For each test case, output a single integer — the minimum number of problems you have to remove so that an arrangement of problems is balanced

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                int val=sc.nextInt();
                if(val<0) val=-val;
                arr[i]=val;
            }
            Arrays.sort(arr);
            long ans=0;
            long count=1;
            for(int i=0;i<n-1;i++){
                if(arr[i+1]-arr[i]<=k) count++;
                else{
                    ans=Math.max(ans,count);
                    //System.out.println(ans);
                    count=1;
                }
            }
            ans=Math.max(ans,count);
            //ans=Math.min(count,n-count);
            ans=(ans==0)? 0: n-ans;
            System.out.println(ans);
            //System.out.println('*');
        }
    }
}
