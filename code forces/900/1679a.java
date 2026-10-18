// Spring has come, and the management of the AvtoBus bus fleet has given the order to replace winter tires with summer tires on all buses.

// You own a small bus service business and you have just received an order to replace n
//  tires. You know that the bus fleet owns two types of buses: with two axles (these buses have 4
//  wheels) and with three axles (these buses have 6
//  wheels).

// You don't know how many buses of which type the AvtoBus bus fleet owns, so you wonder how many buses the fleet might have. You have to determine the minimum and the maximum number of buses that can be in the fleet if you know that the total number of wheels for all buses is n
// .

// Input
// The first line contains an integer t
//  (1≤t≤1000
// ) — the number of test cases. The following lines contain description of test cases.

// The only line of each test case contains one integer n
//  (1≤n≤1018
// ) — the total number of wheels for all buses.

// Output
// For each test case print the answer in a single line using the following format.

// Print two integers x
//  and y
//  (1≤x≤y
// ) — the minimum and the maximum possible number of buses that can be in the bus fleet.

// If there is no suitable number of buses for the given n
// , print the number −1
//  as the answer

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if(n<4 || (n&1L)!=0) System.out.println(-1);
            else{
                long min=0, max=0;
                min=(n+5)/6;
                max=n/4;
                
                System.out.println(min+" "+max);
            }
            
        }
        sc.close();
    }
}
