// Given an array of N intervals in the form of (start[i], end[i]), where start[i] is the starting point of the interval
//   and end[i] is the ending point of the interval, return the minimum number of intervals that need to be removed to make the 
//   remaining intervals non-overlapping.

// Note:
// Intervals which only touch at a point are also considered as non-overlapping. For example, [1, 3] and [3, 4] are non-overlapping.

// Example 1:
// Input : Intervals = [ [1, 2] , [2, 3] , [3, 4] ,[1, 3] ]

// Output : 1
// Explanation : You can remove the interval [1, 3] to make the remaining interval non overlapping.

class Solution {
    public int MaximumNonOverlappingIntervals(int[][] intervals) {
        //your code goes here
       Arrays.sort(intervals, (x,y)-> x[1]-y[1]);
       int endTime=-1, count=0;
       for(int[] a: intervals){
        if(a[0]>=endTime){
            count++;
            endTime=a[1];
        }
       }
       return intervals.length-count;
    }
}
