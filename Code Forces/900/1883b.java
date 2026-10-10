// You are given a string s
//  of length n
// , consisting of lowercase Latin letters, and an integer k
// .

// You need to check if it is possible to remove exactly k
//  characters from the string s
//  in such a way that the remaining characters can be rearranged to form a palindrome. Note that you can reorder the remaining characters in any way.

// A palindrome is a string that reads the same forwards and backwards. For example, the strings "z", "aaa", "aba", "abccba" are palindromes, while the strings "codeforces", "reality", "ab" are not.

// Input
// Each test consists of multiple test cases. The first line contains a single integer t
//  (1≤t≤104
// ) — the number of the test cases. This is followed by their description.

// The first line of each test case contains two integers n
//  and k
//  (0≤k<n≤105
// ) — the length of the string s
//  and the number of characters to be deleted.

// The second line of each test case contains a string s
//  of length n
// , consisting of lowercase Latin letters.

// It is guaranteed that the sum of n
//  over all test cases does not exceed 2⋅105
// .

// Output
// For each test case, output "YES" if it is possible to remove exactly k
//  characters from the string s
//  in such a way that the remaining characters can be rearranged to form a palindrome, and "NO" otherwise.

// You can output the answer in any case (uppercase or lowercase). For example, the strings "yEs", "yes", "Yes", and "YES" will be recognized as positive answers.

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int[] arr = new int[26];
            for(char c: s.toCharArray()) arr[c-'a']++;
            int odd=0;
            for(int i: arr) if((i&1)!=0) odd++;
            System.out.println((odd>k+1)? "NO": "YES");
        }
    }
}
