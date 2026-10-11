// You have an array a1,a2,…,an
// . Answer q
//  queries of the following form:

// If we change all elements in the range al,al+1,…,ar
//  of the array to k
// , will the sum of the entire array be odd?
// Note that queries are independent and do not affect future queries.
// Input
// Each test contains multiple test cases. The first line contains the number of test cases t
//  (1≤t≤104
// ). The description of the test cases follows.

// The first line of each test case consists of 2
//  integers n
//  and q
//  (1≤n≤2⋅105
// ; 1≤q≤2⋅105
// ) — the length of the array and the number of queries.

// The second line of each test case consists of n
//  integers ai
//  (1≤ai≤109
// ) — the array a
// .

// The next q
//  lines of each test case consists of 3
//  integers l,r,k
//  (1≤l≤r≤n
// ; 1≤k≤109
// ) — the queries.

// It is guaranteed that the sum of n
//  over all test cases doesn't exceed 2⋅105
// , and the sum of q
//  doesn't exceed 2⋅105
// .

// Output
// For each query, output "YES" if the sum of the entire array becomes odd, and "NO" otherwise.

// You can output the answer in any case (upper or lower). For example, the strings "yEs", "yes", "Yes", and "YES" will be recognized as positive responses.


import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        while(t-->0){   
            int n=sc.nextInt();   
            int q=sc.nextInt();   
            long[] arr = new long[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            for(int i=1;i<n;i++) arr[i]=arr[i]+arr[i-1];
            while(q-->0){
                int l=sc.nextInt();
                int r=sc.nextInt();
                int k=sc.nextInt();
                if(n==1) System.out.println((k%2==1)? "YES": "NO");
                else{
                    long left=(l==1)? 0: arr[l-2];
                    long rangeType=arr[n-1]-arr[r-1]+left;
                    long kType=(r-l+1L)*k;
                    //System.out.println(kType+" "+rangeType);
                    if((kType+rangeType)%2==1) System.out.println("YES");
                    else System.out.println("NO");
                }
            }
        }
    }
}
