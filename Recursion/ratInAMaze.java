
// Given a grid of dimensions n x n. A rat is placed at coordinates (0, 0) and wants to reach at coordinates (n-1, n-1).

// Find all possible paths that rat can take to travel from (0, 0) to (n-1, n-1). 
//   The directions in which rat can move are 'U' (up) , 'D' (down) , 'L' (left) , 'R' (right).

// The value 0 in grid denotes that the cell is blocked and rat cannot use that cell for travelling, 
//   whereas value 1 represents that rat can travel through the cell. If the cell (0, 0) has 0 value, then mouse cannot move to any other cell.

// Note :

// In a path no cell can be visited more than once.
// If there is no possible path then return empty vector.

class Solution {

    int[] di = {1, 0, 0, -1};
    int[] dj = {0, -1, 1, 0};
    char[] dir = {'D', 'L', 'R', 'U'};

    public void helper(int[][] grid, int i, int j,
                       StringBuilder path, List<String> ans) {

        int n = grid.length;

        if (i < 0 || i >= n || j < 0 || j >= n || grid[i][j] != 1)
            return;

        if (i == n - 1 && j == n - 1) {
            ans.add(path.toString());
            return;
        }

        grid[i][j] = -1;

        for (int k = 0; k < 4; k++) {

            path.append(dir[k]);

            helper(grid,
                   i + di[k],
                   j + dj[k],
                   path,
                   ans);

            path.deleteCharAt(path.length() - 1);
        }

        grid[i][j] = 1;
    }

    public List<String> findPath(int[][] grid) {

        List<String> ans = new ArrayList<>();

        if (grid[0][0] == 0)
            return ans;

        helper(grid, 0, 0, new StringBuilder(), ans);

        return ans;
    }
}
