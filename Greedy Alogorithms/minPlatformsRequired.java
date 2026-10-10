// You are given a 2D integer array intervals where intervals[i] = [lefti, righti] represents the inclusive interval [lefti, righti].
// You have to divide the intervals into one or more groups such that each interval is in exactly one group, 
//   and no two intervals that are in the same group intersect each other.
// Return the minimum number of groups you need to make.
// Two intervals intersect if there is at least one common number between them. For example, the intervals [1, 5] and [5, 8] intersect.


// Example 1:

// Input: intervals = [[5,10],[6,8],[1,5],[2,3],[1,10]]
// Output: 3
// Explanation: We can divide the intervals into the following groups:
// - Group 1: [1, 5], [6, 8].
// - Group 2: [2, 3], [5, 10].
// - Group 3: [1, 10].
// It can be proven that it is not possible to divide the intervals into fewer than 3 groups.
// Example 2:

// Input: intervals = [[1,3],[5,6],[8,10],[11,13]]
// Output: 1
// Explanation: None of the intervals overlap, so we can put all of them in one group.
 

class Solution {
    public int minGroups(int[][] intervals) {
        int[] Arrival = new int[intervals.length];
        int[] Departure = new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            Arrival[i]=intervals[i][0];
            Departure[i]=intervals[i][1];
        }
        Arrays.sort(Arrival);
        Arrays.sort(Departure);
        int i=0, j=0;
        int count=0, maxCount=0;
        while(i<Arrival.length && j<Departure.length){
            if(Arrival[i]<=Departure[j]){
                count++;
                i++;
                maxCount=Math.max(maxCount,count);
            }
            else{
                j++;
                count--;
            }
        }
        while(i<Arrival.length){
            maxCount++;
            i++;
        }
        return maxCount;
    }
}
