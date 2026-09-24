// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, 
//   and return an array of the non-overlapping intervals that cover all the intervals in the input.

// Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==1) return intervals;
        Arrays.sort(intervals, (x,y)-> Integer.compare(x[0],y[0]));
        int st=intervals[0][0], end=intervals[0][1];
        List<int[]> ans = new ArrayList<>();
        int i=0;
        while(i<intervals.length){
            while(i<intervals.length && intervals[i][0]<=end){
                end=Math.max(intervals[i][1], end);
                i++;
            }
            ans.add(new int[]{st,end});
            if(i<intervals.length){
                st=intervals[i][0];
                end=intervals[i][1];
            }        
        }
        
        return ans.toArray(new int[ans.size()][]);
    }
}
