package leetcode.tiq.arrays;

import leetcode.Uninstantiable;

/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/">...</a>
 * Valid Sudoku:
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 * > A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * > Only the filled cells need to be validated according to the mentioned rules.
 * Constraints::
 * > board.length == 9
 * > board[i].length == 9
 * > board[i][j] is a digit 1-9 or '.'
 */

class ValidSudoku extends Uninstantiable {
    static class Solution {
        public boolean isValidSudoku(char[][] board) {
            for (int i = 0; i < 9; i++) {
                if (isNotValidRow(board[i]) || isNotValidColumn(board, i))
                    return false;
                if (i % 3 == 0) {
                    for (int j = 0; j < 9; j = j + 3) {
                        if (isNotValid3x3(board, i, j))
                            return false;
                    }
                }
            }
            return true;
        }

        private boolean isNotValidRow(char[] row) {
            boolean[] used = new boolean[9];
            for (char el : row) {
                if (el != '.') {
                    int k = el - '1';
                    if (used[k])
                        return true;
                    used[k] = true;
                }
            }
            return false;
        }

        private boolean isNotValidColumn(char[][] board, int column) {
            boolean[] used = new boolean[9];
            for (int i = 0; i < 9; i++) {
                char el = board[i][column];
                if (el != '.') {
                    int k = el - '1';
                    if (used[k])
                        return true;
                    used[k] = true;
                }
            }
            return false;
        }

        private boolean isNotValid3x3(char[][] board, int row, int col) {
            boolean[] used = new boolean[9];
            for (int i = row; i < row + 3; i++) {
                for (int j = col; j < col + 3; j++) {
                    char el = board[i][j];
                    if (el != '.') {
                        int k = el - '1';
                        if (used[k])
                            return true;
                        used[k] = true;
                    }
                }
            }
            return false;
        }
    }
}
