// Let's call a positive integer extremely round if it has only one non-zero digit. For example, 5000
// , 4
// , 1
// , 10
// , 200
//  are extremely round integers; 42
// , 13
// , 666
// , 77
// , 101
//  are not.

// You are given an integer n
// . You have to calculate the number of extremely round integers x
//  such that 1≤x≤n
// .

// Input
// The first line contains one integer t
//  (1≤t≤104
// ) — the number of test cases.

// Then, t
//  lines follow. The i
// -th of them contains one integer n
//  (1≤n≤999999
// ) — the description of the i
// -th test case.

// Output
// For each test case, print one integer — the number of extremely round integers x
//  such that 1≤x≤n
// .

import java.util.*;
public class Main{
    static boolean check(int num){
        int zeros=0, total=0;
        while(num>0){
            if(num%10==0) zeros++;
            total++;
            num/=10;
        }
        return zeros==(total-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=999999;i++){
            if(check(i)) arr.add(i);
        }
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int count=0;
            for(int i: arr){
                if(i<=n) count++;
            }
            System.out.println(count);
        }
    }
}
