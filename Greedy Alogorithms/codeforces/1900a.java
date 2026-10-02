// Filip has a row of cells, some of which are blocked, and some are empty. He wants all empty cells to have water in them. 
//He has two actions at his disposal:

// 1
//  — place water in an empty cell.
// 2
//  — remove water from a cell and place it in any other empty cell.
// If at some moment cell i
//  (2≤i≤n−1
// ) is empty and both cells i−1
//  and i+1
//  contains water, then it becomes filled with water.

// Find the minimum number of times he needs to perform action 1
//  in order to fill all empty cells with water.

// Note that you don't need to minimize the use of action 2
// . Note that blocked cells neither contain water nor can Filip place water in them.

// Input
// Each test contains multiple test cases. The first line contains the number of test cases t
//  (1≤t≤100
// ). The description of the test cases follows.

// The first line of each test case contains a single integer n
//  (1≤n≤100
// ) — the number of cells.

// The next line contains a string s
//  of length n
// . The i
// -th character of s
//  is '.' if the cell i
//  is empty and '#' if cell i
//  is blocked.

// Output
// For each test case, output a single number — the minimal amount of actions 1
//  needed to fill all empty cells with water.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s = sc.next();
            int total=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
                if(i+2<n && s.charAt(i)=='.' && s.charAt(i+1)=='.' && s.charAt(i+2)=='.'){
                    flag=true;
                    break;
                }
                if(s.charAt(i)=='.') total++;
            }
            if(flag) System.out.println(2);
            else System.out.println(total);
        }
    }
}
