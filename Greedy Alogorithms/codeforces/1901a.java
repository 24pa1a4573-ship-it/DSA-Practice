// There is a road, which can be represented as a number line. You are located in the point 0
//  of the number line, and you want to travel from the point 0
//  to the point x
// , and back to the point 0
// .

// You travel by car, which spends 1
//  liter of gasoline per 1
//  unit of distance travelled. When you start at the point 0
// , your car is fully fueled (its gas tank contains the maximum possible amount of fuel).

// There are n
//  gas stations, located in points a1,a2,…,an
// . When you arrive at a gas station, you fully refuel your car. Note that you can refuel only at gas stations, and there are no gas stations in points 0
//  and x
// .

// You have to calculate the minimum possible volume of the gas tank in your car (in liters) that will allow you to travel from the point 0
//  to the point x
//  and back to the point 0
// .

// Input
// The first line contains one integer t
//  (1≤t≤1000
// ) — the number of test cases.

// Each test case consists of two lines:

// the first line contains two integers n
//  and x
//  (1≤n≤50
// ; 2≤x≤100
// );
// the second line contains n
//  integers a1,a2,…,an
//  (0<a1<a2<⋯<an<x
// ).
// Output
// For each test case, print one integer — the minimum possible volume of the gas tank in your car that will allow you to travel from the point 0
//  to the point x
//  and back.


import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int ans=arr[0];
            for(int i=0;i<n-1;i++) ans=Math.max(ans, arr[i+1]-arr[i]);
            ans=Math.max(ans, Math.abs((x-arr[n-1])*2));
            if(n==1) ans=Math.max(arr[0], Math.abs((x-arr[n-1])*2));
            System.out.println(ans);
        }
    }
}
