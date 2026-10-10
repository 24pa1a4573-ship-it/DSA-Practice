// Given an 2D array Jobs of size Nx3, where Jobs[i][0] represents JobID , Jobs[i][1] represents Deadline , Jobs[i][2] represents Profit 
//   associated with that job. Each Job takes 1 unit of time to complete and only one job can be scheduled at a time.

// The profit associated with a job is earned only if it is completed by its deadline. Find the number of jobs and maximum profit.

// Example 1:
// Input : Jobs = [ [1, 4, 20] , [2, 1, 10] , [3, 1, 40] , [4, 1, 30] ]
// Output : 2 60
// Explanation : Job with JobID 3 can be performed at time t=1 giving a profit of 40.

// Job with JobID 1 can be performed at time t=2 giving a profit of 20.

// No more jobs can be scheduled, So total Profit = 40 + 20 => 60.

// Total number of jobs completed are two, JobID 1, JobID 3.

// So answer is 2 60.

class Solution {
    public int[] JobScheduling(int[][] Jobs) {
        //your code goes here
        Arrays.sort(Jobs,(x,y)-> y[2]-x[2]);
        boolean[] placed = new boolean[Jobs.length+1];
        int val=0, profit=0;
        for(int i=0;i<Jobs.length;i++){
            for(int j=Jobs[i][1];j>=1;j--){
                if(!placed[j]){
                    placed[j]=true;
                    profit+=Jobs[i][2];
                    val++;
                    break;
                }
            }
        }
        return new int[] {val,profit};

    }
}
