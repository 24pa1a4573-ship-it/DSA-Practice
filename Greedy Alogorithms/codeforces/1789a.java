// Mocha likes arrays, and Serval gave her an array consisting of positive integers as a gift.

// Mocha thinks that for an array of positive integers a
// , it is good iff the greatest common divisor of all the elements in a
//  is no more than its length. And for an array of at least 2
//  positive integers, it is beautiful iff all of its prefixes whose length is no less than 2
//  are good.

// For example:

// [3,6]
//  is not good, because gcd(3,6)=3
//  is greater than its length 2
// .
// [1,2,4]
//  is both good and beautiful, because all of its prefixes whose length is no less than 2
// , which are [1,2]
//  and [1,2,4]
// , are both good.
// [3,6,1]
//  is good but not beautiful, because [3,6]
//  is not good.
// Now Mocha gives you the gift array a
//  of n
//  positive integers, and she wants to know whether array a
//  could become beautiful by reordering the elements in a
// . It is allowed to keep the array a
//  unchanged.

// Input
// Each test contains multiple test cases. The first line contains the number of test cases t
//  (1≤t≤500
// ). The description of the test cases follows.

// The first line of each test case contains a single integer n
//  (2≤n≤100
// ) — the length of array a
// .

// The second line of each test case contains n
//  integers a1,a2,…,an
//  (1≤a1,a2,…,an≤106
// ) — the elements of array a
// .

// Output
// For each test case, print Yes if it is possible to reorder the elements in a
//  to make it beautiful, and print No if not.

// You can output Yes and No in any case (for example, strings yEs, yes, Yes and YES will be recognized as a positive response


import java.util.*;
import java.lang.*;
public class Main{
    static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            boolean flag=false;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(gcd(arr[i], arr[j])<=2){
                        flag=true;
                        break;
                    }
                }
            }
            if(flag) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
