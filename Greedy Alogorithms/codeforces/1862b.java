// Tema and Vika are playing the following game.

// First, Vika comes up with a sequence of positive integers a
//  of length m
//  and writes it down on a piece of paper. Then she takes a new piece of paper and writes down the sequence b
//  according to the following rule:

// First, she writes down a1
// .
// Then, she writes down only those ai
//  (2≤i≤m
// ) such that ai−1≤ai
// . Let the length of this sequence be denoted as n
// .
// For example, from the sequence a=[4,3,2,6,3,3]
// , Vika will obtain the sequence b=[4,6,3]
// .

// She then gives the piece of paper with the sequence b
//  to Tema. He, in turn, tries to guess the sequence a
// .

// Tema considers winning in such a game highly unlikely, but still wants to find at least one sequence a
//  that could have been originally chosen by Vika. Help him and output any such sequence.

// Note that the length of the sequence you output should not exceed the input sequence length by more than two times.

// Input
// Each test consists of multiple test cases. The first line of input data contains a single integer t(1≤t≤104) — the number of test cases. 
//   This is followed by a description of the test cases.

// The first line of each test case contains a single integer n
//  (1≤n≤2⋅105
// ) — the length of the sequence b
// .

// The second line of each test case contains n
//  integers b1,b2,b3,…,bn
//  (1≤bi≤109
// ) — the elements of the sequence.

// The sum of the values of n
//  over all test cases does not exceed 2⋅105
// .

// Output
// For each test case, output two lines. In the first line, output a single integer m
//  — the length of the sequence (n≤m≤2⋅n
// ). In the second line, output m
//  integers a1,a2,a3,…,am
//  (1≤ai≤109
// ) — the assumed sequence that Vika could have written on the first piece of paper.

// If there are multiple suitable sequences, you can output any of them.


import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            al.add(arr[0]);
            for(int i=1;i<n;i++){
                if(arr[i]>=arr[i-1]) al.add(arr[i]);
                else{
                    al.add(arr[i]);
                    al.add(arr[i]);
                }
            }
            System.out.println(al.size());
            for(int i: al) System.out.print(i+" ");
            System.out.println();
        }
        
    }
}
