package leetcode.tiq.arrays;

import leetcode.Uninstantiable;

/**
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/">...</a>
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 * ===
 * Constraints:
 * > n == matrix.length == matrix[i].length
 * > 1 <= n <= 20
 * > -1000 <= matrix[i][j] <= 1000
 */

final class RotateImage extends Uninstantiable {
    final static class Solution {
        public void rotate(int[][] matrix) {
            transpose(matrix);
            reverseRows(matrix);
        }

        private void transpose(int[][] matrix) {
            for (int rows = matrix.length, i = 0; i < rows; i++) {
                for (int j = 0; j <= i; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        private void reverseRows(int[][] matrix) {
            for (int[] row : matrix) {
                for (int j = 0, k = matrix[0].length - 1; j < k; j++, k--) {
                    int temp = row[j];
                    row[j] = row[k];
                    row[k] = temp;
                }
            }
        }
    }
}
