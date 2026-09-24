// Given a 2D array Intervals, where Intervals[i] = [start[i], end[i]] represents the start and end of the ith interval, 
//   the array represents non-overlapping intervals sorted in ascending order by start[i]. 

// Given another array newInterval, where newInterval = [start, end] represents the start and end of another interval, 
//   merge newInterval into Intervals such that Intervals remain non-overlapping and sorted in ascending order by start[i].

// Return Intervals after the insertion of newInterval.

// Example 1:
// Input : Intervals = [ [1, 3] , [6, 9] ] , newInterval = [2, 5]

// Output : [ [1, 5] , [6, 9] ]

// Explanation : After inserting the newInterval the Intervals array becomes [ [1, 3] , [2, 5] , [6, 9] ].
// So to make them non overlapping we can merge the intervals [1, 3] and [2, 5].
// So the Intervals array is [ [1, 5] , [6, 9] ].

class Solution {
    public int[][] insertNewInterval(int[][] Intervals, int[] newInterval) {

        if (Intervals.length == 0)
            return new int[][] {newInterval};

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int i = 0, n = Intervals.length;

        while (i < n && Intervals[i][1] < newInterval[0]) {
            ans.add(new ArrayList<>(
                Arrays.asList(Intervals[i][0], Intervals[i][1])
            ));
            i++;
        }

        while (i < n && Intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], Intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], Intervals[i][1]);
            i++;
        }

        ans.add(new ArrayList<>(
            Arrays.asList(newInterval[0], newInterval[1])
        ));

        while (i < n) {
            ans.add(new ArrayList<>(
                Arrays.asList(Intervals[i][0], Intervals[i][1])
            ));
            i++;
        }

        int[][] fans = new int[ans.size()][2];

        for (int k = 0; k < ans.size(); k++) {
            fans[k][0] = ans.get(k).get(0);
            fans[k][1] = ans.get(k).get(1);
        }

        return fans;
    }
}
