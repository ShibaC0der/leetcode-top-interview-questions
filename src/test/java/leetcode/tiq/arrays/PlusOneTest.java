package leetcode.tiq.arrays;

import leetcode.tiq.arrays.PlusOne.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    private final Solution solution = new Solution();

    @Test
    void example1Test() {
        int[] digits = new int[]{1, 2, 3};

        assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(digits));
    }

    @Test
    void example2Test() {
        int[] digits = new int[]{4, 3, 2, 1};

        assertArrayEquals(new int[]{4, 3, 2, 2}, solution.plusOne(digits));
    }

    @Test
    void example3Test() {
        int[] digits = new int[]{9};

        assertArrayEquals(new int[]{1, 0}, solution.plusOne(digits));
    }
}