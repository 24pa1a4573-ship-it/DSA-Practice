// YunQian is standing on an infinite plane with the Cartesian coordinate system on it. In one move, she can move to the diagonally adjacent point on the top right or the adjacent point on the left.

// That is, if she is standing on point (x,y)
// , she can either move to point (x+1,y+1)
//  or point (x−1,y)
// .

// YunQian initially stands at point (a,b)
//  and wants to move to point (c,d)
// . Find the minimum number of moves she needs to make or declare that it is impossible.

// Input
// The first line contains a single integer t
//  (1≤t≤104
// ) — the number of test cases. The description of test cases follows.

// The first line and only line of each test case contain four integers a
// , b
// , c
// , d
//  (−108≤a,b,c,d≤108
// ).

// Output
// For each test case, if it is possible to move from point (a,b)
//  to point (c,d)
// , output the minimum number of moves. Otherwise, output −1
// .

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(b>d) System.out.println(-1);
            else{
                int y=d-b;
                if(a+y<c) System.out.println(-1);
                else{
                    System.out.println(2*y+a-c);
                }
            }
        }
    }
}
