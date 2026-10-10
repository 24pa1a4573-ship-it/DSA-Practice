// An array b1,b2,…,bn
//  of positive integers is good if all the sums of two adjacent elements are equal to the same value. More formally, the array is good if there exists a k
//  such that b1+b2=b2+b3=…=bn−1+bn=k.

// Doremy has an array a of length n. Now Doremy can permute its elements (change their order) however she wants. Determine if she can make the array good.

// Input
// The input consists of multiple test cases. The first line contains a single integer t
//  (1≤t≤100
// ) — the number of test cases. The description of the test cases follows.

// The first line of each test case contains a single integer n
//  (2≤n≤100
// ) — the length of the array a
// .

// The second line of each test case contains n
//  integers a1,a2,…,an
//  (1≤ai≤105
// ).

// There are no constraints on the sum of n
//  over all test cases.

// Output
// For each test case, print "Yes" (without quotes), if it is possible to make the array good, and "No" (without quotes) otherwise.

// You can output the answer in any case (upper or lower). For example, the strings "yEs", "yes", "Yes", and "YES" will be recognized as positive responses.


import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                int val=sc.nextInt();
                map.put(val, map.getOrDefault(val,0)+1);
            }
            if(map.size()>2) System.out.println("NO");
            else{
                if(map.size()==1) System.out.println("YES");
                else{
                    int[] arr = new int[2];
                    int i=0;
                    for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                        arr[i++]=entry.getValue();
                    }
                    if(arr[0]==arr[1] || Math.abs(arr[0]-arr[1])==1) System.out.println("YES");
                    else System.out.println("NO");
                }
            }
        
        }
    }
}
