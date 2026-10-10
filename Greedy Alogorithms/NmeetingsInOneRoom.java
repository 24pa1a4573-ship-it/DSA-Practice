// Given one meeting room and N meetings represented by two arrays, start and end, 
//   where start[i] represents the start time of the ith meeting and end[i] represents the end time of the ith meeting, 
//   determine the maximum number of meetings that can be accommodated in the meeting room if only one meeting can be held at a time. 
//   A meeting starting at the same time another meeting ends is considered overlapping.

// Example 1:
// Input : Start = [1, 3, 0, 5, 8, 5] , End = [2, 4, 6, 7, 9, 9]

// Output : 4

// Explanation : The meetings that can be accommodated in meeting room are (1,2) , (3,4) , (5,7) , (8,9).

class Solution {
    public int maxMeetings(int[] start, int[] end) {
       //your code goes here
       if(start.length==1) return 1;
       int n=start.length;
       int[][] arr = new int[n][2];
       for(int i=0;i<n;i++){
        arr[i][0]=start[i];
        arr[i][1]=end[i];
       }
       Arrays.sort(arr, (x,y)-> x[1]-y[1]);
       int endTime=-1, count=0;
       for(int[] a: arr){
        if(a[0]>endTime){
            count++;
            endTime=a[1];
        }
       }
       return count;

    }
}
