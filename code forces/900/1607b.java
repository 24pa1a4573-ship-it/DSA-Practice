// The grasshopper is located on the numeric axis at the point with coordinate x0
// .

// Having nothing else to do he starts jumping between integer points on the axis. Making a jump from a point with coordinate x
//  with a distance d
//  to the left moves the grasshopper to a point with a coordinate x−d
// , while jumping to the right moves him to a point with a coordinate x+d
// .

// The grasshopper is very fond of positive integers, so for each integer i
//  starting with 1
//  the following holds: exactly i
//  minutes after the start he makes a jump with a distance of exactly i
// . So, in the first minutes he jumps by 1
// , then by 2
// , and so on.

// The direction of a jump is determined as follows: if the point where the grasshopper was before the jump has an even coordinate, the grasshopper jumps to the left, otherwise he jumps to the right.

// For example, if after 18
//  consecutive jumps he arrives at the point with a coordinate 7
// , he will jump by a distance of 19
//  to the right, since 7
//  is an odd number, and will end up at a point 7+19=26
// . Since 26
//  is an even number, the next jump the grasshopper will make to the left by a distance of 20
// , and it will move him to the point 26−20=6
// .

// Find exactly which point the grasshopper will be at after exactly n
//  jumps.

// Input
// The first line of input contains an integer t
//  (1≤t≤104
// ) — the number of test cases.

// Each of the following t
//  lines contains two integers x0
//  (−1014≤x0≤1014
// ) and n
//  (0≤n≤1014
// ) — the coordinate of the grasshopper's initial position and the number of jumps.

// Output
// Print exactly t
//  lines. On the i
// -th line print one integer — the answer to the i
// -th test case — the coordinate of the point the grasshopper will be at after making n
//  jumps from the point  x

import java.util.*;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
           long x=sc.nextLong();
           long n=sc.nextLong();
           
           long finalPos=0;
           
           if(n%4==0) finalPos=0;
           else if(n%4==1) finalPos=-n;
           else if(n%4==2) finalPos=1;
           else finalPos=n+1;
           
           if(x%2==0) System.out.println(x+finalPos);
           else System.out.println(x-finalPos);
        }
        sc.close();
    }
}
