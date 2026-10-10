// Aca and Milovan, two fellow competitive programmers, decided to give Vasilije a problem to test his skills.

// Vasilije is given three positive integers: n
// , k
// , and x
// , and he has to determine if he can choose k
//  distinct integers between 1
//  and n
// , such that their sum is equal to x
// .

// Since Vasilije is now in the weirdest city in Serbia where Aca and Milovan live, Cacak, the problem seems weird to him. So he needs your help with this problem.

// Input
// The first line contains a single integer t
//  (1≤t≤104
// ) — the number of test cases.

// The only line of each test case contains three integers n
// , k
//  and x
//  (1≤n≤2⋅105
// , 1≤k≤n
// , 1≤x≤4⋅1010
// ) — the maximum element he can choose, the number of elements he can choose and the sum he has to reach.

// Note that the sum of n
//  over all test cases may exceed 2⋅105
// .

// Output
// For each test case output one line: "YES", if it is possible to choose k
//  distinct integers between 1
//  and n
// , such that their sum is equal to x
// , and "NO", if it isn't.

// You can output the answer in any case (for example, the strings "yEs", "yes", "Yes", and "YES" will be recognized as a positive answer).


import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            long x=sc.nextLong();
            
            long min=k*(k+1L)/2;
            long max=(n*(n+1L)/2)-((n-k)*(n-k+1L)/2);
            
            if(x>=min && x<=max) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
