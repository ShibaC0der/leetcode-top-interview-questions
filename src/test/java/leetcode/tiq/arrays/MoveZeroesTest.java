package leetcode.tiq.arrays;

import leetcode.tiq.arrays.MoveZeroes.Solution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    private final Solution solution = new Solution();

    @Test
    void example1Test() {
        int[] nums = new int[]{0, 1, 0, 3, 12};

        solution.moveZeroes(nums);

        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    void example2Test() {
        int[] nums = new int[]{0};

        solution.moveZeroes(nums);

        assertArrayEquals(new int[]{0}, nums);
    }

}