package leetcode.tiq.arrays;

import leetcode.tiq.arrays.RotateImage.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {

    private final Solution solution = new Solution();

    @Test
    void example1Test() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        solution.rotate(matrix);

        assertArrayEquals(new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        }, matrix);
    }

    @Test
    void example2Test() {
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };

        solution.rotate(matrix);

        assertArrayEquals(new int[][]{
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        }, matrix);
    }
}