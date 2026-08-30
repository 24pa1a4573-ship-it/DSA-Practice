// Given an m x n grid of characters board and a string word, return true if word exists in the grid.

// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are 
// horizontally or vertically neighboring. The same letter cell may not be used more than once.

class Solution {

    public boolean dfs(char[][] board, String word,
                       int i, int j, int ind) {

        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length ||
            board[i][j] != word.charAt(ind)) {
            return false;
        }

        if (ind == word.length() - 1) {
            return true;
        }

        char original = board[i][j];

        // Mark as visited
        board[i][j] = '#';

        boolean found =
            dfs(board, word, i + 1, j, ind + 1) ||
            dfs(board, word, i - 1, j, ind + 1) ||
            dfs(board, word, i, j + 1, ind + 1) ||
            dfs(board, word, i, j - 1, ind + 1);

        // Backtrack
        board[i][j] = original;

        return found;
    }

    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }
}
